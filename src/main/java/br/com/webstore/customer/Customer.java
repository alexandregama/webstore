package br.com.webstore.customer;

public class Customer {

	private Long id;
	
	private String name;
	
	private Address address;

	public Customer(Long id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
	
}
