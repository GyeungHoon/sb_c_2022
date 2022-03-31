package com.gang.exam.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.gang.exam.demo.vo.Article;


@Mapper
public interface ArticleRepository {

	
	public void writeArticle(@Param("memberId") int memberId, @Param("boardId")int boardId, @Param("title")String title, @Param("body")String body);
	
	public Article getForPrintArticle(@Param("id") int id);
	
	
	public void deleteArticle(@Param("id") int id);
	
	
	public void modifyArticle(@Param("id")int id, @Param("title")String title, @Param("body")String body);

	
	public List<Article> getArticles(@Param("boardId")int boardId, int limitStart, int limitTake);

	
	public int getLastInsertId();

	public int getArticlesCount(@Param("boardId") int boardId, String searchKeywordTypeCode, String searchKeyword);



}
