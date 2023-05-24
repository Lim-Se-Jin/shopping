package com.co.kr.exception;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;
import org.springframework.web.servlet.ModelAndView;

import com.co.kr.util.CommonUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class AllExceptionHandler {
	
	
	// request error
	@ExceptionHandler(MissingServletRequestParameterException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public HttpEntity<ErrorResponse> handlerBindingResultException(RequestException exception){
		
		// catch exception
		if(exception.getException() != null) {
			Exception ex = exception.getException();
			StackTraceElement [] steArr = ex.getStackTrace();
			for(StackTraceElement ste : steArr) {
				System.out.println(ste.toString());
			}
		}
		
		// response 담기
		ErrorResponse errRes = ErrorResponse.builder()
				.result(exception.getCode().getResult())
				.resultDesc(exception.getCode().getResultDesc())
				.resDate(CommonUtils.currentTime())
				.reqNo(exception.getReqNo())
				.httpStatus(exception.getHttpStatus())
				.build();
		
		return new ResponseEntity<ErrorResponse>(errRes, errRes.getHttpStatus());
	}
	
	
	//db error
	@ExceptionHandler(InternalServerError.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public HttpEntity<ErrorResponse> handelerInternalServerError(InternalException exception) {
		System.out.println("=========Internal Error=========" + exception.getMessage());
		ErrorResponse errRes = ErrorResponse.builder()
				.result(exception.getCode().getResult())
				.resultDesc(exception.getCode().getResultDesc())
				.resDate(CommonUtils.currentTime())
				.reqNo(CommonUtils.currentTime())
				.build();
		return new ResponseEntity<ErrorResponse>(errRes, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	// error page
	@ExceptionHandler(Exception.class)
	public ModelAndView commonException(Exception e) {
		e.getStackTrace();
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e.getStackTrace());
		mv.setViewName("commons/commonErr.html");
		return mv;
	}
	
}