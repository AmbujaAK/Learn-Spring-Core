package com.itsambuja.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/itsambuja/springcore/ref/ref-config.xml");
		
		A a = (A) context.getBean("aref");
		
		System.out.println(a);
		System.out.println(a.getObj().getY());

	}

}
