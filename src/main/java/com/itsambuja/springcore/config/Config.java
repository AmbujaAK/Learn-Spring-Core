package com.itsambuja.springcore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.itsambuja.springcore.config")
public class Config {
	
	/**
	 * Bean has been creating using @Component annotation on ObjectForComponent
	 * 
	 */
	@Autowired
	public ObjectForComponent obj;
	
	
	@Bean
	public ObjectForBean getObjectForBean() {
		return new ObjectForBean();
	}

	/**
	 * Instead of using @Component above Student class.
	 * Bean can be created like this
	 * 
	 * @return Student
	 */
	@Bean
	public Student getStudent() {
		Student student = new Student("Ambuj Kumar", "Bihar", getObjectForBean(), obj);
		
		return student;
	}
}
