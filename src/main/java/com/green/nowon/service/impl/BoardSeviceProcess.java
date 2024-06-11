package com.green.nowon.service.impl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.green.nowon.domain.entity.BoardEntityRepository;
import com.green.nowon.service.BoardService;

import lombok.RequiredArgsConstructor;

@Service //스피링의 빈으로 만들어집니다!
@RequiredArgsConstructor
public class BoardSeviceProcess implements BoardService {
	
	private final BoardEntityRepository repository;

	@Override
	public void findAllprocess(Model model) {
		//페이징처리 
		/*
		Sort sort=Sort.by(Direction.DESC,"no");
		Pageable pageable=PageRequest.of(4529, 10, sort);
		model.addAttribute("list", repository.findAll(pageable));
		*/
		int limit=10; 
		int offset=4542;
		model.addAttribute("list", repository.selectAllWithPagination(limit,offset));
	}

}
