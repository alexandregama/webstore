package br.com.webstore.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class HashMapCustomerDao implements Customers {

	private List<Customer> database = new ArrayList<>();
	
	public HashMapCustomerDao() {
		database.add(new Customer(1L, "Alexandre Gama", new Address("Rua Antonio Vilela", "123")));
		database.add(new Customer(2L, "Gustavo Pereira", new Address("Rua Caetano Veloso", "654")));
		database.add(new Customer(1L, "Eduardo Costa", new Address("Rua Gilberto Gil", "908")));
	}
	
	@Override
	public List<Customer> getAll() {
		return Collections.unmodifiableList(database);
	}

}
