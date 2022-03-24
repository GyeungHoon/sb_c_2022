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
		
		// 로그인 아이디 중복체크
		Member oldmember = getMemberByLoginId(loginId);

		if(oldmember != null) {
			return -1;
		}
		oldmember = getMemberByNameAndEmail(name, email);
		if(oldmember != null) {
			return -2;
		}
		memberRepository.join( loginId,  loginPw,  name, nickname, cellphoneNo, email);	
		return memberRepository.getLastInsertId(); 
	}

	private Member getMemberByNameAndEmail(String name, String email) {
		
		return memberRepository.getMemberByNameAndEmail(name, email);
	}

	private Member getMemberByLoginId(String loginId) {
		return memberRepository.getMemberByLoginId(loginId);
	}

	public Member getMemberById(int id) {
			
		return memberRepository.getMemberById(id);
	}

}
