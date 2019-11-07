package it.unical.asde.slotmachineservice.model;

public class GameStatus {

	
	private String user;
	private Integer coins;
	
	public GameStatus(String user, Integer coins) {
		super();
		this.user = user;
		this.coins = coins;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Integer getCoins() {
		return coins;
	}
	public void setCoins(Integer coins) {
		this.coins = coins;
	}
	
	
	
}
