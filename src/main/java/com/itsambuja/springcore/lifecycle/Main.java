package com.itsambuja.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/itsambuja/springcore/lifecycle/lifecycle-config.xml");

		AbstractApplicationContext abscontext = new ClassPathXmlApplicationContext("com/itsambuja/springcore/lifecycle/lifecycle-config.xml");

		Samosa s1 = (Samosa) abscontext.getBean("s1");
		
		System.out.println(s1);
		abscontext.registerShutdownHook();
		
		System.out.println("*******************");
		
		Pepsi p1 = (Pepsi) abscontext.getBean("p1");
		
		System.out.println(p1);
		
		System.out.println("*******************");

		AnnotionExample aexample = (AnnotionExample) abscontext.getBean("aexample");
		System.out.println(aexample);
	}
}
