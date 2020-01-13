package it.unical.asde.slotmachineservice.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.unical.asde.slotmachineservice.model.GameStatus;

@Repository
public interface GameStatusDAO extends CrudRepository<GameStatus, String> {

	List<GameStatus> findByCoins(Integer coins);
	
}
