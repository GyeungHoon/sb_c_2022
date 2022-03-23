package com.gang.exam.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.gang.exam.demo.vo.Article;


@Mapper
public interface ArticleRepository {

	@Select("select * from article where id =#{id}")
	public Article writeArticle(String title, String body);
	
	
	public Article getArticle(int id);
	
	
	public void deleteArticle(int id);
	
	
	public void modifyArticle(int id, String title, String body);

	
	public List<Article> getArticles();



}
