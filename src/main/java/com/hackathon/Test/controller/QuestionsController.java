package com.hackathon.Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.Test.service.QuestionsService;

@RestController
public class QuestionsController {
	
	@Autowired
	private QuestionsService qnsService;

}
