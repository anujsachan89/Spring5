package com.anuj.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// create a student object
		Student theStudent = new Student();
		//add student object to model
		theModel.addAttribute("student", theStudent);
		return"student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute ("student") Student theStudent) {
		
		//log the input log
		System.out.println("First Name: "+theStudent.getFirstName());
		System.out.println("Last Name: "+theStudent.getLastName());
		return"student-confirmation";
	}
}
