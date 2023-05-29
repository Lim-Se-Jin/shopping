package com.co.kr.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.co.kr.domain.BoardContentDomain;
import com.co.kr.domain.BoardFileDomain;
import com.co.kr.domain.BoardListDomain;

@Mapper
public interface UploadMapper {

	//list
	public List<BoardListDomain> boardList();
	
	//content insert
	public void contentUpload(BoardContentDomain boardContentDomain);
	//file insert
	public void fileUpload(BoardFileDomain boardFileDomain);
	
	//select one
	public BoardListDomain boardSelectOne(HashMap<String, Object> map);
	//select one file
	public List<BoardFileDomain> boardSelectOneFile(HashMap<String, Object> map);

	//content update
	public void bdContentUpdate(BoardContentDomain boardContentDomain);
	//file updata
	public void bdFileUpdate(BoardFileDomain boardFileDomain);

    //content delete 
	public void bdContentRemove(HashMap<String, Object> map);
	//file delete 
	public void bdFileRemove(BoardFileDomain boardFileDomain);

}