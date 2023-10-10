package com.springboot.project.sms.service;

import java.util.List;

import com.springboot.project.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getById(Long rollId);
	Student editStudent(Student student);
	void deleteStudent(Long rollId);
}
