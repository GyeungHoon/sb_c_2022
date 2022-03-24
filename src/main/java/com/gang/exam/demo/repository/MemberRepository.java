package com.gang.exam.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gang.exam.demo.vo.Member;

@Mapper
public interface MemberRepository {

	
	void join(@Param("loginId")String loginId, @Param("loginPw")String loginPw,
			@Param("name")String name, @Param("nickname")String nickname,
			@Param("cellphoneNo")String cellphoneNo, @Param("email")String email);

	int getLastInsertId();

	Member getMemberById(@Param("id")int id);

}
