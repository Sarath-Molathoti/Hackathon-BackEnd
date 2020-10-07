package com.hackathon.Test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.Test.model.Questions;
import com.hackathon.Test.service.QuestionsService;

@CrossOrigin(origins="http://localhost:4200")

@RestController
public class QuestionsController {
	
	@Autowired
	private QuestionsService qnsService;
	
	@GetMapping(path="/get_aptitude_questions")
	public List<Questions> getAptitudeQuestions(){
		return qnsService.getAptitudeQuestions();
	}
	
	@GetMapping(path="/get_coding_questions")
	public List<Questions> getCodingQuestions(){
		return qnsService.getCodingQuestions();
	}
}
