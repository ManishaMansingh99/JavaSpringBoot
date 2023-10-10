package com.springboot.first.database.service.impl;

import java.util.List;
//import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.first.database.model.Employee;
import com.springboot.first.database.repository.EmployeeRepository;
import com.springboot.first.database.service.EmployeeService;
import com.springboot.first.database.exceptions.ResourceNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> emp= employeeRepository.findById(id);
//				if(emp.isPresent()) {
//					return emp.get();
//				}
//				else {
//					throw new ResourceNotFoundException("Employee", "id", id);
//				}
		
		//Lamda Expressions
		return employeeRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Employee", "id", id));
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		//check if id exists or not
		Employee empExists=employeeRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Employee", "id", id));
		
		//update data using set get
		empExists.setFirstName(employee.getFirstName());
		empExists.setLastName(employee.getLastName());
		empExists.setEmail(employee.getEmail());
		empExists.setJobId(employee.getJobId());
		
		//same the changes in the database
		employeeRepository.save(empExists);
		return empExists;
	}

	@Override
	public void deleteEmployee(long id) {
		
		employeeRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Employee", "id", id));
		
		employeeRepository.deleteById(id);
		
	}
}
