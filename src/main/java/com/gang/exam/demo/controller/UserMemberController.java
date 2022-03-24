package com.gang.exam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gang.exam.demo.service.MemberService;
import com.gang.exam.demo.util.Ut;
import com.gang.exam.demo.vo.Member;

@Controller
public class UserMemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping("/urs/member/doJoin")
	@ResponseBody
	public Object doJoin(String loginId, String loginPw, String name, String nickname, String cellphoneNo,
			String email) {

		if(Ut.empty(loginId)) {
			return "loginId(을)를 입력해주세요.";
		}
		if(Ut.empty(loginPw)) {
			return "loginPw(을)를 입력해주세요.";
		}
		if(Ut.empty(name)) {
			return "name(을)를 입력해주세요.";
		}
		if(Ut.empty(nickname)) {
			return "nickname(을)를 입력해주세요.";
		}
		if(Ut.empty(cellphoneNo)) {
			return "cellphoneNo(을)를 입력해주세요.";
		}
		if(Ut.empty(email)) {
			return "email(을)를 입력해주세요.";
		}
	
		
		int id = memberService.join(loginId, loginPw, name, nickname, cellphoneNo, email);
		
		if(id == -1) {
			return "해당 로그인 아이디는 이미 사용중입니다.";
		}
		if(id == -2) {
			return "해당 이름과 이메일은 사용중입니다.";
		}
		
		Member member = memberService.getMemberById(id);
		return member;
	}

}