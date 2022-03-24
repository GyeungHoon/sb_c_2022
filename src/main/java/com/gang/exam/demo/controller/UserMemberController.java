package com.gang.exam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gang.exam.demo.service.MemberService;
import com.gang.exam.demo.vo.Member;

@Controller
public class UserMemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping("/urs/member/doJoin")
	@ResponseBody
	public Object doJoin(String loginId, String loginPw, String name, String nickname, String cellphoneNo,
			String email) {

		if(loginId == null || loginId.trim().length() == 0) {
			return "loginId(을)를 입력해주세요.";
		}
		if(loginPw == null || loginPw.trim().length() == 0) {
			return "loginPw(을)를 입력해주세요.";
		}
		if(name == null || name.trim().length() == 0) {
			return "name(을)를 입력해주세요.";
		}
		if(nickname == null || nickname.trim().length() == 0) {
			return "nickname(을)를 입력해주세요.";
		}
		if(cellphoneNo == null || cellphoneNo.trim().length() == 0) {
			return "cellphoneNo(을)를 입력해주세요.";
		}
		if(email == null || email.trim().length() == 0) {
			return "email(을)를 입력해주세요.";
		}
	
		
		int id = memberService.join(loginId, loginPw, name, nickname, cellphoneNo, email);
		
		if(id == -1) {
			return "해당 로그인 아이디는 이미 사용중입니다.";
		}
		
		Member member = memberService.getMemberById(id);
		return member;
	}

}