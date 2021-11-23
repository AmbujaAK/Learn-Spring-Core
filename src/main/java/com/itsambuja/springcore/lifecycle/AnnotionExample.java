package com.itsambuja.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotionExample {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AnnotionExample(String title) {
		super();
		this.title = title;
	}

	public AnnotionExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AnnotionExample [title=" + title + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("INIT : Annotation Example");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY : Annotation Example");
	}
	
}
