package com.springcor.constructor;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> address;
	
	
	public Person(String name, int personId, Certi certi, List address) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.address= address;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + ", address=" + address + "]";
	}


	
	


	
	}
	
	
	

