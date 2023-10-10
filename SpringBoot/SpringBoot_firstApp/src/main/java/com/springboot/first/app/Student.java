package com.springboot.first.app;

public class Student {
	private String firstName;
	private String lastName;
	//when want to create a java class as java bean make sure to make the static variables a s getter setter
	public Student(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	}	
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	
}
