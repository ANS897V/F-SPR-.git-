package com.springcor.stereotype;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class St {
	
	@Value("Anshuman Verma")
	private String studentName;
	
	@Value("JHS")
	private String studentCity;
	
	@Value("#{list}")
	private List<String> address;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return " [studentName=" + studentName + ", studentCity=" + studentCity + ", address=" + address + "]";
	}
	
	
	
	
	
	
	

}
