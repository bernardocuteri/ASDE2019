package it.unical.asde.slotmachineservice.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import it.unical.asde.slotmachineservice.model.Bet;
import it.unical.asde.slotmachineservice.model.BetResult;
import it.unical.asde.slotmachineservice.model.GameStatus;

@Service
public class SlotMachineService {

	public final static int SLOTS = 3;
	public final static int VALUES = 3;
	public final static int INITIAL_COINS = 200;
	
	private Map<String, Integer> playersCoins = new HashMap<>();
	
	public BetResult bet(Bet bet) {
		String user = bet.getUser();
		if(!playersCoins.containsKey(user) || playersCoins.get(user) < bet.getBet())
			return null;
		int betting = bet.getBet();
		int coins = playersCoins.get(user);
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
		playersCoins.put(user, coins);
		
		return new BetResult(coins, slots);
		
		
	}
	
	public GameStatus initGame(String username) {
		if(!playersCoins.containsKey(username)) {
			playersCoins.put(username, INITIAL_COINS);
		}
		return new GameStatus(username, playersCoins.get(username));
	}
	
}
