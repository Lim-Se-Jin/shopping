package com.co.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.co.kr.domain.BoardListDomain;
import com.co.kr.mapper.UploadMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class UploadServiceImple implements UploadService {

	@Autowired
	private UploadMapper uploadMapper;
	
	@Override
	public List<BoardListDomain> boardList() {
		// TODO Auto-generated method stub
		return uploadMapper.boardList();
	}

}