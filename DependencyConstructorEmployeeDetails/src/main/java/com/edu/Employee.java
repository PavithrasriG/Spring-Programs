package com.edu;

public class Employee {
	 
	  private int eid;
	  private String ename;
	  private float salary;
	
	// generate the constructor field
	  
	  
	  public Employee(int eid, String ename, float salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	  
	public void display() {
		System.out.println("Employee id:"  +eid);
		System.out.println("Employee name:"  +ename);
		System.out.println("Employee salary:" +salary);
		
	}
	  
	  
}
