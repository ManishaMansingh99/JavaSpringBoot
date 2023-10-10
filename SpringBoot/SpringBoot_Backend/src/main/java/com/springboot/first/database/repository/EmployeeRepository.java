package com.springboot.first.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.first.database.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
