package com.springcor.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcor.Student;


public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcor/stereotype/stereoconfig.xml");
		St st = (St) context.getBean("st");
      
      
		System.out.println(st);
		

	}

}
