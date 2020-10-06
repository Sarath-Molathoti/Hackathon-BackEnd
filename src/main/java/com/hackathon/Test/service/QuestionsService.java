package com.hackathon.Test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.Test.repository.QuestionsRepository;

@Service
@Transactional
public class QuestionsService {
	
	@Autowired
	private QuestionsRepository qnsRepository;

}
