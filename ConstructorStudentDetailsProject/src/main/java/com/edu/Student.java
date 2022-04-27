package com.edu;

public class Student {

	private int sid;
	private String sname;
	private String course;
	private float fees;
	
	// generate the constructor the field
	public Student(int sid, String sname, String course, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
		this.fees = fees;
	}
	
   public void display() {
	   System.out.println("Student id:"+sid);
	   System.out.println("Student name:"+sname);
	   System.out.println("Student course:"+course);
	   System.out.println("Student fees:"+fees);
   }
	
	
	
}
