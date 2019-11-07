package it.unical.asde.slotmachineservice.model;

import java.util.ArrayList;

public class BetResult {

	int remainingCoins;
	ArrayList<Integer> slots = new ArrayList<>();
	
	public BetResult() {
		super();
	}
	public BetResult(int remaingCoins, ArrayList<Integer> slots) {
		super();
		this.remainingCoins = remaingCoins;
		this.slots = slots;
	}
	
	public ArrayList<Integer> getSlots() {
		return slots;
	}
	public void setSlots(ArrayList<Integer> slots) {
		this.slots = slots;
	}
	
	public int getRemainingCoins() {
		return remainingCoins;
	}
	public void setRemainingCoins(int remainingCoins) {
		this.remainingCoins = remainingCoins;
	}
	
	
}
