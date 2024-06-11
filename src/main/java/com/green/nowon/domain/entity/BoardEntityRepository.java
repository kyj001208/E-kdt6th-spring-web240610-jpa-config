package com.green.nowon.domain.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//@Repository //@Repository: 표시 용도이므로 필수는 아니다. 안해도 됌
public interface BoardEntityRepository extends JpaRepository<BoardEntity, Long>{

	@Query(value="select * from board ORDER BY no DESC "
			+ "LIMIT :limit OFFSET :offset", nativeQuery = true)//nativeQuery = true :마리아 db를 사용할게요, mapper 대신 Repository
	List<BoardEntity> selectAllWithPagination(@Param("limit") int limit, @Param("offset") int offset );

	

}
