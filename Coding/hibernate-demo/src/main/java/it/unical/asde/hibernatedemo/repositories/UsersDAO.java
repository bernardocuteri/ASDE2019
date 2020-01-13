package it.unical.asde.hibernatedemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.unical.asde.hibernatedemo.model.User;

public interface UsersDAO extends CrudRepository<User, String>{

	List<User> findUsersByUserCarsBrand(String string);

	@Query("FROM User u join fetch u.phoneNumbers WHERE u.username=:id")
	User findByIdWithPhoneNumbers(String id);
	
	
}
