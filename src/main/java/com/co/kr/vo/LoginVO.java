package com.co.kr.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class LoginVO {
	private String seq;
	private String id;
	private String pw;
	private String admin;
	private String level;
}