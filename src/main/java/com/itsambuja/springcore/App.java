package com.itsambuja.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itsambuja.springcore.collections.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml", "collection-config.xml");
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        
        System.out.println(student1);
        System.out.println(student2);
        
    }
}
