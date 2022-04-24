package com.kim.bloom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*회원과 관련된 요청을 따로 관리하기 위해 controller를 분리*/
@Controller
@RequestMapping("/member") /* 회원과 관련되 호출을 url 경로에서 member를 타도록 설계 */
public class MemberController {
	
	/* Console 창에 해당 로그가 찍혀 프로그램이 오류 발생 시 어디서 어떤 이유로 오류가 발생하는지 알 수 있어 이슈 처리가 용이 */
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinGET() {
		logger.info("회원가입 페이지 진입");
		return "join";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGET() {
		logger.info("회원가입 페이지 진입");
		return "login";
	}
}
