package com.spring.di.ex02;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String name;
	private int age;
	private String tel;
	private ArrayList<String> circle;
	
	// 기본생성자
	public Student() {
		
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public ArrayList<String> getCircle() {
		return circle;
	}

	public void setCircle(ArrayList<String> circle) {
		this.circle = circle;
	}
	
	
	
	

}
