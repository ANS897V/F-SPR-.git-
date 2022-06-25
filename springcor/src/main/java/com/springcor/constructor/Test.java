package com.springcor.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	
	public static void main(String args[]) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcor/constructor/constconfig.xml");
        Person person1=(Person) context.getBean("person");
        
        System.out.println(person1);
//        System.out.println();
	}

}
