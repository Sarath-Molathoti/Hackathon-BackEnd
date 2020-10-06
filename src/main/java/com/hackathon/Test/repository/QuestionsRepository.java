package com.hackathon.Test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackathon.Test.model.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long>{



	@Query(value="SELECT * FROM questions WHERE question_type=?1 ORDER BY RAND() LIMIT 10", nativeQuery = true)
	List<Questions> getAptitudeQuestions(String type);

	@Query(value="SELECT * FROM questions WHERE question_type=?1 ORDER BY RAND() LIMIT 10", nativeQuery = true)
	List<Questions> getCodingQuestions(String type);

}
