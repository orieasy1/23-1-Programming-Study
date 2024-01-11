package com.spring.mvc.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.mvc.member.repository.MemberVO;
import com.spring.mvc.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	// 회원의 목록 페이지 요청
	@GetMapping("/list")
	public String memberList(Model model) {
		
		List<MemberVO> list = service.memberList();
		
		model.addAttribute("memberList", list);
		
		return "member/memberList";
	}
	
	// 회원가입시 폼 페이지 요청
	@GetMapping("/join")
	public String joinForm() {
		return "member/joinForm";
	}
	
	
	
	// 회원가입 폼에서 회원가입 요청
	@PostMapping("/join")
	public String memberInsert(MemberVO member, RedirectAttributes ra) {
		
		String msg = null;
		
		// 아이디를 체크해서 같은 아이디가 있는지 확인 후에 
		// 같은 아이디가 있다면 회원가입 X
		boolean idCheck = service.memberIdCheck(member.getId());
		
		if(idCheck) {
			msg = "같은 아이디가 있습니다.";
			
			ra.addFlashAttribute("msg", msg);
			// addFlashAttribute : 리다이렉트 직전 플레시에 데이터를 저장하는 메소드
			// 일회성 데이터를 보내주기 때문에 리다이렉트 이후에는 소멸한다.
			
			return "redirect:/member/join";
		}
		
		
		boolean bool = service.memberInsert(member);
		
		if(bool) {
			msg = "회원 가입 되었습니다.";
			ra.addFlashAttribute("msg", msg);
			return "redirect:/member/list";
		}else {
			msg = "회원 가입 실패입니다.";
			ra.addFlashAttribute("msg", msg);
			
			return "redirect:/member/join";
		}
		
	}
	
	// 회원 정보 페이지 요청
	@GetMapping("/info")
	public String memberInfo(@RequestParam("id")String id, Model model) {
		
		MemberVO member = service.getMember(id);
		
		model.addAttribute("info", member);
		
		return "member/memberInfo";
	}
	
	// 회원 수정 폼페이지 요청
	@GetMapping("/modify")
	public String memberModify(@RequestParam("id")String id, Model model) {
		
		MemberVO member = service.getMember(id);
		model.addAttribute("modify", member);
		
		return "member/modifyForm";
	}
	
	// 회원 수정요청
	@PostMapping("/modify")
	public String memberModify(MemberVO member, RedirectAttributes ra) {
		
		boolean check = service.memberModify(member);
		
		String msg = null;
		
		if(check) {
			msg = "회원정보가 수정되었습니다.";
		}else {
			msg = "회원정보 수정 실패입니다.";
		}
		
		ra.addFlashAttribute("msg", msg);
		
		return "redirect:/member/list";
		
	}
	
	// 회원 탈퇴요청
	@PostMapping("/delete")
	public String memberDelete(String id, RedirectAttributes ra) {
		
		boolean check = service.memberDelete(id);
		
		String msg = null;
		
		if(check) {
			msg = "회원탈퇴가 되었습니다.";
		}else {
			msg = "회원탈퇴 실패입니다.";
		}
		
		ra.addFlashAttribute("msg", msg);
		
		return "redirect:/member/list";
	}
	
	
}







