package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.nowon.service.BoardService;
import com.green.nowon.service.impl.BoardSeviceProcess;

import lombok.RequiredArgsConstructor;


@Controller //프레젠테이션 계층
@RequiredArgsConstructor
@RequestMapping("/boards") //해당 매핑을 사용시에는 getmapping에서 생략가능 
public class BoardController {
	
	//private  BoardService service=new BoardSeviceProcess(); //스피링빈이 있기에 이런코드는 사용하지 않습니다.
	
	private  final BoardService service; //생성자 DI-스프링에서 자동처리
	
	//게시글의 내용을 표현해주는 페이지 
	@GetMapping // ("/boards")가 생략된것 ("/") 를 넣을 경우 에러 발생
	public String list(Model model) {
		
		service.findAllprocess(model); //model을 서비스로 위임할거면 계속 넘겨주고 해라 인마!
		
		return "views/board/list";
	}
	

}
