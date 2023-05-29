package com.co.kr.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder(builderMethodName="builder")
public class LoginDomain {

	private Integer mbSeq;
	private String mbId;
	private String mbPw;
	private String mbLevel;
	private String mbIp;
	private String mbUse;
	private String mbCreateAt;
	private String mbUpdateAt;
	
}