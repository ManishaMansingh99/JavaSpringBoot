package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/Student")
	public Student getStudent() {
		return new Student("Manisha","Singh");
	}
	@GetMapping("/StudentList")
	public List<Student> getStudentList() {
		List<Student> sudentsList= new ArrayList<>();
			sudentsList.add(new Student("Manisha","Singh"));
			sudentsList.add(new Student("Bungru","Singh"));
			sudentsList.add(new Student("Raj","Kashyap"));
			sudentsList.add(new Student("Gourav","Samal"));
			sudentsList.add(new Student("Goru","Goru"));
		return sudentsList;
	}
}
