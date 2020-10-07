package com.hackathon.Test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackathon.Test.model.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long>{



	@Query(value="SELECT * FROM questions WHERE question_type=?1 ORDER BY RAND() LIMIT 10", nativeQuery = true)
	List<Questions> getAptitudeQuestions(String type);

	@Query(value="SELECT * FROM questions WHERE question_type=?1 ORDER BY RAND() LIMIT 10", nativeQuery = true)
	List<Questions> getCodingQuestions(String type);
	
	@Query(value="SELECT COUNT(*) FROM questions", nativeQuery = true)
    long getCount();

	@Modifying
	@Query(value="INSERT INTO questions(question_id,question,option1,option2,option3,option4,answer,question_type) VALUES(?1,?2,?3,?4,?5,?6,?7,?8)", nativeQuery = true)
	void saveQn(long question_id, String question, String option1, String option2, String option3, String option4,
			String answer, String questionType);

}
