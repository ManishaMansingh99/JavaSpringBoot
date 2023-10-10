package com.springboot.first.database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Getter@Setter
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Getter@Setter
	@Column(name = "last_name")
	private String lastName;
	
	@Getter@Setter
	@Column(name = "email")
	private String email;
	
	@Getter @Setter
	@Column(name = "job_id", nullable= false)
	private String jobId;
}