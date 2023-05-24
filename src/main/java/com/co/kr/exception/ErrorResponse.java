package com.co.kr.exception;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(builderMethodName = "builder")
public class ErrorResponse {
	
	private Integer result;
	private String resultDesc;
	private HttpStatus httpStatus;
	private String resDate;
	private String reqNo;
	
}