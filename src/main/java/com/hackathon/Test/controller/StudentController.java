package com.hackathon.Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.Test.model.Student;
import com.hackathon.Test.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studService;
	
	@PostMapping(path="/register-student")
	public void registerStudent(@RequestBody Student student) {
		studService.registerStudent(student);
	}
	
	@GetMapping(path="/{email_id}/{password}")
	public boolean checkForUser(@PathVariable String email_id, @PathVariable String password) {
		int count = studService.checkForUser(email_id,password);
		if(count==1) {
			return true;
		}else {
			return false;
		}
	}

}
