package com.green.nowon.domain.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardDTO {
	
	private long no;
	private String title; // 게시글 제목
	private String content; // 내용
	private int readCount;  
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;


}
