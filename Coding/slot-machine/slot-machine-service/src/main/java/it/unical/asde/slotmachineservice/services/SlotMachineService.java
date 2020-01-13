package it.unical.asde.slotmachineservice.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unical.asde.slotmachineservice.model.Bet;
import it.unical.asde.slotmachineservice.model.BetResult;
import it.unical.asde.slotmachineservice.model.GameStatus;
import it.unical.asde.slotmachineservice.repositories.GameStatusDAO;

@Service
public class SlotMachineService {
	
	@Autowired
	private GameStatusDAO gameStatusDAO;

	public final static int SLOTS = 3;
	public final static int VALUES = 3;
	public final static int INITIAL_COINS = 200;
	
	
	public synchronized BetResult bet(Bet bet) {
		String user = bet.getUser();
		GameStatus gameStatus = gameStatusDAO.findById(user).get();
		int betting = bet.getBet();
		int coins = gameStatus.getCoins();
		Random rand = new Random();
		ArrayList<Integer> slots = new ArrayList<Integer>();
		for(int i=0;i < SLOTS;i++) {
			slots.add(rand.nextInt(VALUES));
		}
		
		if((slots.get(0) == slots.get(1)) && (slots.get(1) == slots.get(2))) {
			coins += (betting*9);
		} else {
			coins -= betting;
		}
		
		gameStatusDAO.deleteById(user);
		gameStatusDAO.save(new GameStatus(user, coins));
			
		return new BetResult(coins, slots);
		
		
	}
	
	public synchronized GameStatus initGame(String username) {
		
		if(gameStatusDAO.existsById(username)) {
			return gameStatusDAO.findById(username).get();
		}
		return gameStatusDAO.save(new GameStatus(username, INITIAL_COINS));
		
	}
	
}
