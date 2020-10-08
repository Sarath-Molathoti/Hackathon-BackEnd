package com.hackathon.Test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackathon.Test.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	@Query(value="SELECT COUNT(*) FROM student WHERE email_id=?1 AND password=?2", nativeQuery = true)
	int checkForUser(String email_id, String password);

	@Modifying
	@Query(value="UPDATE student SET score=?2 WHERE email_id=?1 ", nativeQuery = true)
	void updateStudentScore(String email_id, Long score);

	@Query(value="SELECT score FROM student WHERE email_id=?1 ", nativeQuery = true)
	long getStudentScore(String email_id);

	@Query(value="SELECT * FROM student WHERE email_id=?1 ", nativeQuery = true)
	Student getDetailsByEmail(String email_id);

	@Query(value="SELECT aptitude_score FROM student WHERE email_id=?1 ", nativeQuery = true)
	long getAptitudeScoreByEmail(String email_id);
	
	@Query(value="SELECT coding_score FROM student WHERE email_id=?1 ", nativeQuery = true)
	long getCodingScoreByEmail(String email_id);

	@Modifying
	@Query(value="UPDATE student SET aptitude_score=?2 WHERE email_id=?1 ", nativeQuery = true)
	void updateAptitudeScore(String email_id, Long score);

	@Modifying
	@Query(value="UPDATE student SET coding_score=?2 WHERE email_id=?1 ", nativeQuery = true)
	void updateCodingScore(String email_id, Long score);

	@Query(value="SELECT * FROM student WHERE student_id=?1 ", nativeQuery = true)
	Student getDetailsByStudentId(Long student_id);

	@Query(value="SELECT * FROM student ORDER BY aptitude_score DESC ", nativeQuery = true)
	List<Student> getStudentsByAptitudeScore();

	@Query(value="SELECT * FROM student ORDER BY coding_score DESC ", nativeQuery = true)
	List<Student> getStudentsByCodingScore();

	@Query(value="SELECT * FROM student ORDER BY cgpa DESC ", nativeQuery = true)
	List<Student> getStudentsByCgpa();


}
