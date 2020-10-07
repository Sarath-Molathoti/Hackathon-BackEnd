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

	public void addQuestion(Questions question) {
		long question_id = qnsRepository.getCount();
		question_id = question_id + 1;
		// TODO Auto-generated method stub
		qnsRepository.saveQn(question_id,question.getQuestion(),question.getOption1(),question.getOption2(),question.getOption3(),question.getOption4(), question.getAnswer(),question.getQuestionType());
		
	}

}
