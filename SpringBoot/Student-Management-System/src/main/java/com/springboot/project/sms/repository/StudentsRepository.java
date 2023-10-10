package com.springboot.project.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.sms.entity.Student;

public interface StudentsRepository extends JpaRepository<Student, Long> {

}
