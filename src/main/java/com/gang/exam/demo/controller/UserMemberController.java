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
	public Member doJoin(String loginId, String loginPw, String name, String nickname, String cellphoneNo,
			String email) {

		int id = memberService.join(loginId, loginPw, name, nickname, cellphoneNo, email);
		Member member = memberService.getMemberById(id);

		return member;
	}

}