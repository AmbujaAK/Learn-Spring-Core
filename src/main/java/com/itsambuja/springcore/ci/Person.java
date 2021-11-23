package com.itsambuja.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Address address;
	private List<String> phones;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", address=" + address + ", phones=" + phones + "]";
	}

	public Person(String name, int personId, Address address, List<String> phones) {
		super();
		this.name = name;
		this.personId = personId;
		this.address = address;
		this.phones = phones;
	}
	
	
	
}
