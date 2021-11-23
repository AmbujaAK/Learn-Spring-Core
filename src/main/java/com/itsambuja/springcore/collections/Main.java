package com.itsambuja.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/itsambuja/springcore/collections/collection-config.xml");
		
        Employee emp1 = (Employee) context.getBean("emp1");
        System.out.println(emp1);
        
        System.out.println(emp1.getAddresses());

	}
}
