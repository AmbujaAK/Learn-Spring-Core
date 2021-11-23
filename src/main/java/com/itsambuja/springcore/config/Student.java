package com.itsambuja.springcore.config;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("Ambuj Kumar")
	private String studentName;

	@Value("Gaya")
	private String city;
	
	private ObjectForBean objectForBean;
	
	private ObjectForComponent objectForComponent;
		
	public Student(String studentName, String city, ObjectForBean objectForBean,
			ObjectForComponent objectForComponent) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.objectForBean = objectForBean;
		this.objectForComponent = objectForComponent;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public ObjectForBean getObjectForBean() {
		return objectForBean;
	}
	public void setObjectForBean(ObjectForBean objectForBean) {
		this.objectForBean = objectForBean;
	}
	public ObjectForComponent getObjectForComponent() {
		return objectForComponent;
	}
	public void setObjectForComponent(ObjectForComponent objectForComponent) {
		this.objectForComponent = objectForComponent;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", objectForBean=" + objectForBean
				+ ", objectForComponent=" + objectForComponent + "]";
	}
	
	public void invoke() {
		this.objectForBean.display();
		this.objectForComponent.display();
	}
	

}
