package com.jjangplay.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/list.do")
	public String list() {
		return "board/list";
	}
	
	@GetMapping("/view.do")
	public String view() {
		return "board/view";
	}
}
