package com.gang.exam.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gang.exam.demo.vo.Board;

@Mapper
public interface BoardRepository {
	
	Board getBoardById(@Param("id") int id);

}
