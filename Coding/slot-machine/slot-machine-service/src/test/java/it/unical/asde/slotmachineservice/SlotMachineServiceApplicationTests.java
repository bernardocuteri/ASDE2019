package it.unical.asde.slotmachineservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.unical.asde.slotmachineservice.model.GameStatus;
import it.unical.asde.slotmachineservice.repositories.GameStatusDAO;

@SpringBootTest
class SlotMachineServiceApplicationTests {

	@Autowired
	private GameStatusDAO repository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void databaseWorks() {
		repository.save(new GameStatus("ciccio", 200));
		assertEquals(2, repository.count());
		assertEquals(1, repository.findByCoins(200).size());
	}

}
