package com.springboot.project.sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "studentsData")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long rollId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="standard")
	private long standard;
	
	@Column(name="grades")
	private double grades;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, long standard, double grades) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.standard = standard;
		this.grades = grades;
	}
	
	public long getRollId() {
		return rollId;
	}
	public void setRollId(long rollId) {
		this.rollId = rollId;
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
	public long getStandard() {
		return standard;
	}
	public void setStandard(long standard) {
		this.standard = standard;
	}
	public double getGrades() {
		return grades;
	}
	public void setGrades(double grades) {
		this.grades = grades;
	}
	


}
