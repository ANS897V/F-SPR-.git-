package com.springcor.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcor.javaconfig" )
public class JavaConfig {
	
	@Bean
	public Base getBase () {
		return new Base();
		
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getBase());
		return student;
		
	}
}
