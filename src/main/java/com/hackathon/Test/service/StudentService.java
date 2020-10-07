package com.hackathon.Test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.Test.model.Student;
import com.hackathon.Test.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository studRepository;

	public void registerStudent(Student student) {
		// TODO Auto-generated method stub
		studRepository.save(student);
		
	}

	public int checkForUser(String email_id, String password) {
		// TODO Auto-generated method stub
		return studRepository.checkForUser(email_id,password);
	}

	public List<Student> findStudentsScores() {
		// TODO Auto-generated method stub
		return studRepository.findAll();
	}

	public void updateStudentScore(String email_id, Long score) {
		// TODO Auto-generated method stub
		studRepository.updateStudentScore(email_id,score);
		
	}

	public long getStudentScore(String email_id) {
		// TODO Auto-generated method stub
		return studRepository.getStudentScore(email_id);
	}

	public Student getDetailsByEmail(String email_id) {
		// TODO Auto-generated method stub
		return studRepository.getDetailsByEmail(email_id);
	}

	public long getAptitudeScoreByEmail(String email_id) {
		// TODO Auto-generated method stub
		return studRepository.getAptitudeScoreByEmail(email_id);
	}

	public long getCodingScoreByEmail(String email_id) {
		// TODO Auto-generated method stub
		return studRepository.getCodingScoreByEmail(email_id);
	}

	public void updateAptitudeScore(String email_id, Long score) {
		// TODO Auto-generated method stub
		studRepository.updateAptitudeScore(email_id,score);
		
	}
	
	public void updateCodingScore(String email_id, Long score) {
		studRepository.updateCodingScore(email_id,score);
	}

}
