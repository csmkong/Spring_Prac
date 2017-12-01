package com.spring.ex2;

public class Student {
	private String name;
	private String age;
	private String grade;
	private String number;
	
	
	
	
	public Student(String name, String age, String grade, String number) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}
