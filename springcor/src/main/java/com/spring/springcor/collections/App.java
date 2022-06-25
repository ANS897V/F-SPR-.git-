package com.spring.springcor.collections;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/springcor/collections/cconfig.xml");
        
        Emp emp1 = (Emp) context.getBean("emp1");
//        Employee emp2 = (Employee) context.getBean("emp2");
        
        System.out.println(emp1.getName());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getCourses());
//        System.out.println(student2);
    }
}
