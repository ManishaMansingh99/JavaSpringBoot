package com.springboot.project.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.springboot.project.sms.entity.Student;
import com.springboot.project.sms.service.StudentService;

@Controller
public class StudentController {
	private StudentService studentSvc;

	public StudentController(StudentService studentSvc) {
		super();
		this.studentSvc = studentSvc;
	}
	
	@GetMapping("/students")
	public String getAllStudents(Model model){
		//in model we give a key and vaue pair
		model.addAttribute("students", studentSvc.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/add")
	public String addStudent(Model model){
		//created an empty Student object variable to hold the data
		Student s= new Student();
		model.addAttribute("newstudent",s);
		return "creat_student";	
	}
	
	@PostMapping("/students")
	public String saveStudentNew(@ModelAttribute("student") Student std) {
		studentSvc.saveStudent(std);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{rollId}")
	public String editStudentForm(@PathVariable Long rollId, Model model) {
		model.addAttribute("student", studentSvc.getById(rollId));
		return "edit_student";
	}
	
	@PostMapping("/students/{rollId}")
	public String updateStudent(@PathVariable Long rollId, @ModelAttribute("student") Student std, Model model) {
		
		//get student from database by id
		Student findStudent= studentSvc.getById(rollId);
		findStudent.setRollId(rollId); 
		findStudent.setFirstName(std.getFirstName());
		findStudent.setLastName(std.getLastName());
		findStudent.setStandard(std.getStandard());
		findStudent.setGrades(std.getGrades());
		
		//save the updates
		studentSvc.editStudent(findStudent);
		
		return "redirect:/students";
	}
	
	@GetMapping("/students/{rollId}")
	public String deleteStudent(@PathVariable Long rollId) {
		studentSvc.deleteStudent(rollId);
		return "redirect:/students";
	}
}
