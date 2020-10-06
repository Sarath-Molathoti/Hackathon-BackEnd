package com.hackathon.Test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.Test.model.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long>{

}
