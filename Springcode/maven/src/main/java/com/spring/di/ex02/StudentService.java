package com.spring.di.ex02;

public class StudentService {
	
	private Student student;
	
	// setter 메소드
	public void setStudent(Student student) {
		this.student = student;
	}
	
	// 학번, 이름, 나이, 전화번호, 동아리를 출력하는 
	// studentProfile 메소드 만들기
	public void studentProfile() {
		
		System.out.println("학번 : " + student.getStudentID());
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		System.out.println("전화번호 : " + student.getTel());
		System.out.println("동아리 : " + student.getCircle());
		
		
	}
	
	
	
}
