package com.co.kr.exception;

import java.util.Map;

import com.co.kr.code.Code;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InternalException extends RuntimeException{
	
	private static final long serialVersionUID = -7457312605485052136L;
	//serialVersionUID == '분산처리 환경에서 유일한Unique 클래스라는 것을 증명하기 위한 신분증'
	
	private Code code;
	private Map<String, Object> map;
	private String errorMsg;
	
	public InternalException(Code code) {
		this.code = code;
	}
	
	public InternalException(Code code, Map<String, Object> map) {
		this(code);
		this.map = map;
	}
	
	public InternalException(Code code,  String errorMsg) {
		this(code);
		this.errorMsg = errorMsg;
	}
	
	public InternalException(Code code, Map<String, Object> map, String errorMsg) {
		this(code);
		this.map = map;
		this.errorMsg = errorMsg;
	}
	
	
	// 생성자
	public static InternalException fire(Code code) {
		return new InternalException(code);
	}
	
	public static InternalException fire(Code code, Map<String, Object> map) {
		return new InternalException(code, map);
	}
	
	public static InternalException fire(Code code, String errorMsg) {
		return new InternalException(code, errorMsg);
	}
	
	public static InternalException fire(Code code, Map<String, Object> map, String errorMsg) {
		return new InternalException(code, map, errorMsg);
	}
}