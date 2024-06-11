package com.green.nowon.domain.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@MappedSuperclass //공통필드 상속 

public abstract class BaseEntity {//별도로 entity를 붙이지 않고 사용(독립적으로 만들지 않는다는 의미에서 추상클래스) 
	

	//@CreatedDate- @EnableJpaAuditing 및 entity클래스에 리스너도 등록해야함
	@CreationTimestamp
	@Column(columnDefinition = "timestamp")
	private LocalDateTime createdAt;
	
	//@LastModifiedDate- @EnableJpaAuditing 및 클래스마다 리스너도 등록 필요
	@UpdateTimestamp
	@Column(columnDefinition = "timestamp")
	private LocalDateTime updatedAt;
	

}
