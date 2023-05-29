package com.co.kr.service;

import java.util.List;
import java.util.Map;

import com.co.kr.domain.LoginDomain;

public interface UserService {
	  // selectId
  public LoginDomain mbSelectList(Map<String, String> map);
  
  // selectAll
  public List<LoginDomain> mbAllList(Map<String, Integer> map);
  
  // selectAll Count
  public int mbGetAll();
  
  //신규
  public void mbCreate(LoginDomain loginDomain);
  
  //getMbIdCheck
  public LoginDomain mbGetId(Map<String, String> map);
  
  //mbDuplicationCheck
  public int mbDuplicationCheck(Map<String, String> map);
  
  //update
  public void mbUpdate(LoginDomain loginDomain); 
  
  //delete 
  public void mbRemove(Map<String, String> map); 
  
}