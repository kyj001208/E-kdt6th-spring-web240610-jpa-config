package com.green.nowon.domain.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


//@EntityListeners(AuditingEntityListener.class)= @EnableJpaAuditing 사용시 해당 클래스에 리스너 등록 
//시퀀스-생성시켜주는 기능
@SequenceGenerator(name = "gen_board" ,
			sequenceName= "seq_board", initialValue = 1, allocationSize = 1)

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)//생성자를 private로 만들어주는 코드
@NoArgsConstructor
@Getter
@Entity //엔티티 확인 표시, 테이블 대신 사용 (jpa-ORM 기술표준) :DB의 테이블과 JAVA의 클래스
@Table(name = "board")//클래스 이름이 테이블명-별도 지정 가능 
public class BoardEntity extends BaseEntity{
		
		//@GeneratedValue(strategy = GenerationType.IDENTITY )//배치 전략 = auto-increament
	
		
		@GeneratedValue(strategy =  GenerationType.SEQUENCE, generator ="gen_board")
		@Id //PK컬럼입니다
		private long no;
		
		@Column(nullable = false )//not null이라는 뜻
		private String title; // 게시글 제목
		@Column(columnDefinition = "text not null") //String 경우 db로 갈때 varchar로 지정되는데 더 긴 text로 지정하기 위해 columnDefinition 사용 
		private String content; // 내용
		
		private int readCount;  // 조회수 , db에서 자동으로 underscore 표기법으로 적용됨

		/*
		@Builder
		private public BoardEntity(long no, String title, String content, int readCount) {
			
			this.no = no;
			this.title = title;
			this.content = content;
			this.readCount = readCount;
		}
		
		*/
	
		
	
}
