package com.gang.exam.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gang.exam.demo.repository.MemberRepository;
import com.gang.exam.demo.vo.Member;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;

	public int join(String loginId, String loginPw, String name, String nickname, String cellphoneNo, String email) {
		memberRepository.join( loginId,  loginPw,  name, nickname, cellphoneNo, email);	
		return memberRepository.getLastInsertId(); 
	}

	public Member getMemberById(int id) {
			
		return memberRepository.getMemberById(id);
	}

}
