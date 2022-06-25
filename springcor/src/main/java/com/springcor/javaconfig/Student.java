package com.springcor.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Base base;
	
	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}
	
	public Student(Base base) {
		super();
		this.base = base;
	}


	public void study() {
		this.base.display();
		System.out.println("student is studying");
		
	}

}
