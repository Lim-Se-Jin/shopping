package com.co.kr.service;

import java.util.List;

import com.co.kr.domain.BoardListDomain;

public interface UploadService {
	
	// 전체 리스트 조회
	public List<BoardListDomain> boardList();

}