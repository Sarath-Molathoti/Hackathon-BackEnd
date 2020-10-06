package com.hackathon.Test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackathon.Test.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	@Query(value="SELECT COUNT(*) FROM student WHERE email_id=?1 AND password=?2", nativeQuery = true)
	int checkForUser(String email_id, String password);

}
