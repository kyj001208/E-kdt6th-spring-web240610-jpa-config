package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.nowon.service.MybatisBoardService;


@RequiredArgsConstructor
@Controller
@RequestMapping("/mybatis")
public class MybatisBoardController {
	
	private final MybatisBoardService service;
	
	@GetMapping("/boards") // === "/mybatis/boards"
	public String list(Model model) {
		
		service.findAll(model);
		return "views/board/list";
	}
	

}
