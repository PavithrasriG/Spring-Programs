package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

  ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
  
  
  // get the object
  Student s1= (Student) ctx.getBean("sob");
  s1.display();
  Student s2= (Student) ctx.getBean("sob1");
  s2.display();
  
	}

}
