package com.spring.db.movie.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.db.movie.dao.MovieMemberDAO;
import com.spring.db.movie.dto.MovieMemberDTO;

@Controller
public class MovieController {
	
	@Autowired
	private MovieMemberDAO dao;
	
	@GetMapping("/movie/login")
	public String login() {
		return "movie/loginForm";
	}
	
	@PostMapping("/movie/login")
	public String login(@RequestParam("userId")String userId, 
						@RequestParam("userPw")String userPw,
						HttpSession session) {
		
		int result = dao.loginCheck(userId, userPw);
		
		if(result == 1) {
			
			MovieMemberDTO dto = dao.getMember(userId);
			session.setAttribute("movie", dto);
			return "redirect:/movie/main";
			
		}else {
			return "redirect:/movie/login";
		}
		
	}
	
	@GetMapping("/movie/main")
	public String movieMain(HttpSession session) {
		
		if(session.getAttribute("movie") != null) {
			
			MovieMemberDTO dto = (MovieMemberDTO)session.getAttribute("movie");
			
			MovieMemberDTO dto2 = dao.getMember(dto.getUserId());
			
			session.setAttribute("movie", dto2);
			
			int ticketNumber = dao.getTicketNumber(dto2.getUserId());
			
			session.setAttribute("ticketNumber", ticketNumber);
			
			return "movie/main";
			
		}else {
			
			return "redirect:/movie/login";
		}
		
		
	}
	
	@GetMapping("/movie/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/movie/login";
	}
	
	
	@GetMapping("/movie/ticket/buy")
	public String buyTicket() {
		return "movie/buyTicket";
	}
	
	
	@PostMapping("/movie/ticket/buy")
	public String buyTicket(@RequestParam("userId")String userId, 
					@RequestParam("ticketNumber")Integer ticketNumber) {
		
		dao.buyTicket(userId, ticketNumber);
		
		return "redirect:/movie/main";
	}
	
	
}








