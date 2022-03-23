package com.gang.exam.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.gang.exam.demo.vo.Article;


@Mapper
public interface ArticleRepository {

	
	public Article writeArticle(String title, String body);
	
	
	@Select("SELECT * from article where id = #{id}")
	public Article getArticle(@Param("id") int id);
	
	@Delete("DELETE from article where id = #{id}")
	public void deleteArticle(@Param("id") int id);
	
	@Update("UPDATE article set title = #{title}, `body`=#{body}, updateDate=NOW() where id=#{id}")
	public void modifyArticle(@Param("id")int id, @Param("title")String title, @Param("body")String body);

	@Select("SELECT * from article ORDER BY id DESC")
	public List<Article> getArticles();



}
