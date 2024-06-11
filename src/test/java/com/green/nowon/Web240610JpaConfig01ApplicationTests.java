package com.green.nowon;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.green.nowon.domain.entity.BoardEntity;
import com.green.nowon.domain.entity.BoardEntityRepository;

@SpringBootTest
class Web240610JpaConfig01ApplicationTests {

	@Autowired
	BoardEntityRepository rep;
	
	@Test
	void board_dummy() {
		IntStream.rangeClosed(1, 100000).forEach(i->{
			//BoardEntity entity2=new BoardEntity(i, null, null, i);
			
			BoardEntity entity=BoardEntity.builder()
					.title("제목" +i)
					.content("내용"+i)
					.build();
			rep.save(entity);

		});  //int 형 스트림 객체를 100개를 만들었습니다. 하나씩 뽑아서 i에 저장(for-each)랑 동일
	}

}
