package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//get the object
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e1= (Employee)   ctx.getBean("empob");
		e1.display();
		
		Employee e2= (Employee)  ctx.getBean("empob1");
		e2.display();
	}

}
