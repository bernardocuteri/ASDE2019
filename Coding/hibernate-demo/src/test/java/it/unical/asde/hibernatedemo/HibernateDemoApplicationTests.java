package it.unical.asde.hibernatedemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.unical.asde.hibernatedemo.model.Address;
import it.unical.asde.hibernatedemo.model.Car;
import it.unical.asde.hibernatedemo.model.User;
import it.unical.asde.hibernatedemo.repositories.CarsDAO;
import it.unical.asde.hibernatedemo.repositories.UsersDAO;

@SpringBootTest
class HibernateDemoApplicationTests {

	@Autowired
	private UsersDAO usersDAO;
	
	@Autowired
	private CarsDAO carsDAO;
	
	@BeforeEach
	public void resetDB() {
		usersDAO.deleteAll();
		carsDAO.deleteAll();
	}
	
	@Test
	public void userDAOWorks() {
		usersDAO.save(new User("ciccio", new Address("rende", "via p. bucci", 10), Arrays.asList("3241782741", "81741298041"), new ArrayList<>(), new Date()));
		User ciccio = usersDAO.findById("ciccio").get();
		ciccio.setAddress(new Address("rende", "via p. bucci", 20));
		usersDAO.save(ciccio);
		assertEquals(usersDAO.count(), 1);
	}
	
	@Test
	public void findUsersByUserCarsBrandWorks() {
		User ciccio = usersDAO.save(new User("ciccio", new Address("rende", "via p. bucci", 10), new ArrayList<>(), new ArrayList<>(), new Date()));
		carsDAO.save(new Car("GH231IF", "500x", "FIAT", ciccio));
		carsDAO.save(new Car("HT209IO", "Giulietta", "Alfa Romeo", ciccio));
		assertEquals(1, usersDAO.findUsersByUserCarsBrand("FIAT").size());
	}
	
	
	@Test
	public void findByIdWithPhoneNumbersWorks() {
		usersDAO.save(new User("ciccio", new Address("rende", "via p. bucci", 10), Arrays.asList("3241782741", "81741298041"), new ArrayList<>(), new Date()));
		assertEquals(2, usersDAO.findByIdWithPhoneNumbers("ciccio").getPhoneNumbers().size());
	}
	

}
