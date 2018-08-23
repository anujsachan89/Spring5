package com.anuj.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
/*Parent Mapping*/
public class HelloWorldController {

	// need a controller method to show initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//need a controller to process a HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method to read form data and
	// add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request param from html form
		String theName = request.getParameter("studentName");
		
		//convert the data all in caps
		theName= theName.toUpperCase();
		//create a  message
		String result = "Yo ! "+theName;
		
		//add mesaage to model
		model.addAttribute("message", result);
		return "helloworld";
	}
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		//convert the data all in caps
		theName= theName.toUpperCase();
		//create a  message
		String result = "Hey All ! "+theName;
		
		//add mesaage to model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	
}
