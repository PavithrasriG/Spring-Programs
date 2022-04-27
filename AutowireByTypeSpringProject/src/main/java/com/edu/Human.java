package com.edu;

public class Human {
	private Heart heart;

	
	// generate the setter and getter method
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("getter and setter method");
	}
	
	public void humanFunction() {
		if(heart!=null) {
			 heart.pump();
}
		else {
			System.out.println("Not alive");
		}
	}
	

}
