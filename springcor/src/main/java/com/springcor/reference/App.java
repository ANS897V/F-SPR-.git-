package com.springcor.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcor/reference/refconfig.xml");
        A temp=(A) context.getBean("aref");
        
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        

//        Employee emp2 = (Employee) context.getBean("emp2");
        
//        System.out.println(emp1.getName());
//        System.out.println(emp1.getAddresses());
//        System.out.println(emp1.getPhones());
//        System.out.println(emp1.getCourses());
//        System.out.println(student2);
    }
}
