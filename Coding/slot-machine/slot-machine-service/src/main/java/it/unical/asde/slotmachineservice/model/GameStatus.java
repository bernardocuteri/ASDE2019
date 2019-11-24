package it.unical.asde.slotmachineservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GameStatus {

	@Id
	private String user;
	
	@Column(nullable = false)
	private Integer coins;
	
	
	public GameStatus() {
		super();
	}
	
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
