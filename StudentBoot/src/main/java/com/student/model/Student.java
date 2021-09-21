package com.student.model;

public class Student {
	private Integer rollNo; 

	private String name; 

	private String course; 

	private String college;

	public Student(Integer rollNo, String name, String course, String college) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.college = college;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
}
