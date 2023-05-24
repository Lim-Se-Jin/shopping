package com.co.kr.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

import com.co.kr.code.Code;

import lombok.Getter;

@Getter
public class RequestException extends RuntimeException {
	
	private static final long serialVersionUID = 855926457087732200L;  // 이기종간 충돌방지 / 클래스에서 클릭
	
	private Code code;
	private String errMsg;
	private HttpStatus httpStatus;
	private Exception exception;
	private BindingResult result;
	private String reqNo;
	

	// 생성자
	public RequestException(Code code) {
		this.code = code;
	}
	
	public RequestException(Code code, String errMsg) {
		this.code = code;
		this.errMsg = errMsg;
	}
	
	
	public RequestException(Code code, String errMsg, HttpStatus httpStatus) {
		this.code = code;
		this.errMsg = errMsg;
		this.httpStatus = httpStatus;
	}
	
	public RequestException(Code code, String errMsg, HttpStatus httpStatus, Exception exception) {
		this.code = code;
		this.errMsg = errMsg;
		this.httpStatus = httpStatus;
		this.exception = exception;
	}
	
	public RequestException(Code code, String errMsg, HttpStatus httpStatus, Exception exception, BindingResult result,
			String reqNo) {
		this.code = code;
		this.errMsg = errMsg;
		this.httpStatus = httpStatus;
		this.exception = exception;
		this.result = result;
		this.reqNo = reqNo;
	}
	
	//생성자 이용 객체생성
	public static RequestException fire(Code code) {
		return new RequestException(code);
	}
	
	public static RequestException fire(Code code, String errMsg) {
		return new RequestException(code, errMsg);
	}
	
	public static RequestException fire(Code code, String errMsg, HttpStatus httpStatus) {
		return new RequestException(code, errMsg, httpStatus);
	}
	
	public static RequestException fire(Code code, String errMsg, HttpStatus httpStatus, Exception exception) {
		return new RequestException(code, errMsg, httpStatus, exception);
	}
	
	public static RequestException fire(Code code, String errMsg, HttpStatus httpStatus, Exception exception, BindingResult result, String reqNo) {
		return new RequestException(code);
	}
	
}