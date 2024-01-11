package com.spring.web.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.web.board.dto.BoardDTO;
import com.spring.web.board.search.SearchVO;
import com.spring.web.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	// 게시판 목록을 요청 /list
	@GetMapping("/list")
	public String list(@RequestParam(value="page", required=false)Integer currentPage, 
						SearchVO search, 
						Model model) {
		
		List<BoardDTO>list = 
				service.boardList(currentPage, search, model);
		
		
		
		model.addAttribute("list", list);
		
		return "board/list";
	}
	
	// 글 작성 폼 요청 /write
	@GetMapping("/write")
	public String writeForm() {
		return "board/writeForm";
	}
	
	// 글 작성 후 글 등록 요청 /write
	@PostMapping("/write")
	public String write(BoardDTO dto, RedirectAttributes ra) {
		
		int result = service.boardInsert(dto);
		
		String msg = null;
		
		if(result == 1) {
			msg = "글이 등록되었습니다.";
			ra.addFlashAttribute("msg", msg);
			return "redirect:/board/list";
		}else {
			msg = "글이 등록되지 않았습니다.";
			ra.addFlashAttribute("msg", msg);
			return "redirect:/board/write";
		}
		
		
	}
	
	// 목록에서 제목클릭시 해당 내용 요청 /contentView
	@GetMapping("/contentView")
	public String content(@RequestParam("id")Integer id, Model model) {
		
		BoardDTO dto = service.boardContent(id);
		
		model.addAttribute("content", dto);
		
		return "board/contentView";
	}
	
	// 글 수정 폼 요청 /modifyForm
	@RequestMapping("/modifyForm")
	public String modifyForm() {
		return "board/modifyForm";
	}
	
	// 글 수정 등록 요청 /modify
	@PostMapping("/modify")
	public String modify(BoardDTO dto, RedirectAttributes ra) {
		
		int result = service.boardModify(dto);
		
		String msg = null;
		
		if(result == 1) {
			msg = "글이 수정되었습니다.";
		}else {
			msg = "글이 수정되지 않았습니다.";
		}
		
		ra.addFlashAttribute("msg", msg);
		
		return "redirect:/board/list";
	}
	
	// 글 삭제 요청 /delete
	@PostMapping("/delete")
	public String delete(@RequestParam("id")Integer id, RedirectAttributes ra) {
		
		int result = service.boardDelete(id);
		
		String msg = null;
		
		if(result == 1) {
			msg = "글이 삭제되었습니다.";
		}else {
			msg = "글이 삭제되지 않았습니다.";
		}
		
		ra.addFlashAttribute("msg", msg);
		
		return "redirect:/board/list";
	}
	
	
	
}








