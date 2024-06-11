package com.green.nowon.domain.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository //@Repository: 표시 용도이므로 필수는 아니다. 안해도 됌
public interface BoardEntityRepository extends JpaRepository<BoardEntity, Long>{
	
	

}
