package com.co.kr.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.co.kr.domain.BoardFileDomain;
import com.co.kr.domain.BoardListDomain;
import com.co.kr.vo.FileListVO;

public interface UploadService {
	
	// 전체 리스트 조회
	public List<BoardListDomain> boardList();
	
	// 인서트 및 업데이트
	public int fileProcess(FileListVO fileListVO, MultipartHttpServletRequest request, HttpServletRequest httpReq);
	
	// 하나 삭제
	public void bdContentRemove(HashMap<String, Object> map);
	
	// 하나 삭제
	public void bdFileRemove(BoardFileDomain boardFileDomain);

	// 하나 리스트 조회
		public BoardListDomain boardSelectOne(HashMap<String, Object> map);
		// 하나 파일 리스트 조회
		public List<BoardFileDomain> boardSelectOneFile(HashMap<String, Object> map);
}