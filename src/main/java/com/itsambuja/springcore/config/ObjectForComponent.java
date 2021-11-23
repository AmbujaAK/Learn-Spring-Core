package com.itsambuja.springcore.config;

import org.springframework.stereotype.Component;

@Component
public class ObjectForComponent {
	public void display() {
		System.out.println("calling from : Object using @Component");
	}
}
