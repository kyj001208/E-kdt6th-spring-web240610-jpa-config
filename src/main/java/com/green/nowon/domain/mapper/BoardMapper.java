package com.green.nowon.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.green.nowon.domain.dto.BoardDTO;

@Mapper
public interface BoardMapper {
	
	List<BoardDTO> findAll();

}
