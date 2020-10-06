package com.hackathon.Test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.Test.model.Questions;
import com.hackathon.Test.repository.QuestionsRepository;

@Service
@Transactional
public class QuestionsService {
	
	@Autowired
	private QuestionsRepository qnsRepository;

	public List<Questions> getAptitudeQuestions() {
		// TODO Auto-generated method stub
		return qnsRepository.getAptitudeQuestions("Aptitude");
	}

	public List<Questions> getCodingQuestions() {
		// TODO Auto-generated method stub
		return qnsRepository.getCodingQuestions("Coding");
	}

}
