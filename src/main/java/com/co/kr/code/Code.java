package com.co.kr.code;

import lombok.Getter;

@Getter
public class Code {
	S200(0, "Success"), // 성공
	S201(201, "데이터 없음"),
	E100(-100, "필수 파라메터 에러"),
	E101(-101, "cmd 에러"),
	E102(-102, "허용 범위 초과"),
	E200(-200, "Auth fail ( 인증 실패 -인증토큰 / 허용 IP / 허용 mac 에러 )"),
	E300(-300, "DB 연동 실패"),
	E301(-301, "DB 정보 암호화 실패"),
	E400(-400, "처리 실패"),
	E404(-404, "파일 없음"),
	E500(-500, "서버 처리 실패"),
	E701(-701, "가입자 회선이 존재하지 않습니다."),
	E702(-702, "중복된 트랜잭션 요청 입니다.");
	
	private String resultDesc; 
	private Integer result;

	Code(Integer result, String resultDesc) {
		this.result = result;
		this.resultDesc = resultDesc;
	}

}
