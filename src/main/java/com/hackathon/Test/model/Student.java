package com.hackathon.Test.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long studentId;
	private String name;
	private String emailId;
	private String password;
	private Long age;
	private String collegeName;
	private BigDecimal cgpa;
	private Long aptitudeScore;
	private Long codingScore;
	private Long mobile;
	private String address;
	
	Student(){
		
	}

	public Student(String name, String emailId, String password, Long age, String collegeName, BigDecimal cgpa,
			Long aptitudeScore, Long codingScore, Long mobile, String address) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.age = age;
		this.collegeName = collegeName;
		this.cgpa = cgpa;
		this.aptitudeScore = aptitudeScore;
		this.codingScore = codingScore;
		this.mobile = mobile;
		this.address = address;
	}


	public Long getAptitudeScore() {
		return aptitudeScore;
	}

	public void setAptitudeScore(Long aptitudeScore) {
		this.aptitudeScore = aptitudeScore;
	}

	public Long getCodingScore() {
		return codingScore;
	}

	public void setCodingScore(Long codingScore) {
		this.codingScore = codingScore;
	}

	public Long getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public BigDecimal getCgpa() {
		return cgpa;
	}

	public void setCgpa(BigDecimal cgpa) {
		this.cgpa = cgpa;
	}


	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
