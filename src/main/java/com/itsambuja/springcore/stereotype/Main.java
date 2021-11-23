package com.itsambuja.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/itsambuja/springcore/stereotype/stereotype-config.xml");
		
		Student student = context.getBean("student", Student.class);
		System.out.println(student);

	}

}
