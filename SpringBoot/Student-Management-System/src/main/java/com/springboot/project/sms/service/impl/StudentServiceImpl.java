package com.springboot.project.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.project.sms.entity.Student;
import com.springboot.project.sms.repository.StudentsRepository;
import com.springboot.project.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	private StudentsRepository studentRepo;

	public StudentServiceImpl(StudentsRepository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getById(Long rollId) {
		return studentRepo.findById(rollId).get();
	}

	@Override
	public Student editStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudent(Long rollId) {
		studentRepo.deleteById(rollId);
		
	}
	
}
