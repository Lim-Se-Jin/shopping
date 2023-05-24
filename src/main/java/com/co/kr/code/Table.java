package com.co.kr.code;

import lombok.Getter;

@Getter
public enum Table {

	MEMBER("member"),
	FILES("files"),
	BOARD("board");
	
	private String table;

	Table(String table){
		this.table = table;
	}
	
}