package com.itsambuja.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/itsambuja/springcore/autowire/autowire-config.xml");
		
		Employee emp1 = context.getBean("emp1", Employee.class);
		
		System.out.println(emp1);
	}

}
