package com.springcor.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcor/autowired/autoconfig.xml");
//        Emp emp1 = context.getBean(emp1);
        Emp emp1 = (Emp) context.getBean("emp1");
        
        
        System.out.println(emp1);
//        System.out.println();
    }
}
