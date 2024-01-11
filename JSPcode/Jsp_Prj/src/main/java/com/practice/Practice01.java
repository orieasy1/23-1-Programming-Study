package com.practice;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice01 {

	public static void main(String[] args) {
		
		// Date : 날짜 형식의 클래스로 현재 시간으로 객체를 생성
		
//		Date now = new Date();
//		
//		System.out.println(now.toString());
		
		Timestamp now = new Timestamp(System.currentTimeMillis());
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat format2 = new SimpleDateFormat("a hh시 mm분 ss초");
		
		String date = format1.format(now);
		String time = format2.format(now);
		
		System.out.println("오늘의 날짜 : " + date);
		System.out.println("현재 시간 : " + time);
		
		
		
		
	}

}
