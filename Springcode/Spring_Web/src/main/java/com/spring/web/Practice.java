package com.spring.web;

public class Practice {

	public static void main(String[] args) {
		
		int totalPosts; // 총 게시글 수
		int viewPostsNum; // 한 페이지당 보여지는 글 수
		
		int totalPage; // 총 페이지 수
		
		// 문제 : 총 게시글이 20개이고, 한 페이지당 글수가 5개라면? 
		// 총 페이지 수는? 4개
		totalPosts = 20;
		viewPostsNum = 5;
		
		totalPage = ((totalPosts -1) / viewPostsNum) + 1;
		
		System.out.println(totalPage);
		
		// 문제 : 총 게시글이 21개이고, 한 페이지당 글수가 5개라면? 
		// 총 페이지 수는? 5개
		
		totalPosts = 21;
		viewPostsNum = 5;
		
		//totalPage = ((totalPosts -1) / viewPostsNum) + 1;
		
		double a = (totalPosts / (double)viewPostsNum);
		double b = Math.ceil(a);
		System.out.println(b);
		int result = (int)b;
		System.out.println(result);
		//System.out.println(totalPage);
		

	}

}
