package com.gang.exam.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gang.exam.demo.vo.Article;

@Component
public class ArticleRepository {
	
	private int articlesLastId ;
	private List<Article> articles ;
	
	public ArticleRepository() {
		
		articlesLastId = 0; 
		articles = new ArrayList<>();
		
	}
	
	// 서비스 메서드 시작

	public Article writeArticle(String title, String body) {
		int id = articlesLastId + 1;
		Article article = new Article(id, title, body);
		articles.add(article);
		articlesLastId = id;
		return article;
		
	}
	
	public Article getArticle(int id) {
		
		for(Article article : articles) {
			if(article.getId() == id) {
				return article;
			}
		}
		
		return null;
	}
	
	public void deleteArticle(int id) {
		
		Article article = getArticle(id);
		articles.remove(article);
		
	}
	
	public void modifyArticle(int id, String title, String body) {
		
		Article article = getArticle(id);
		
		article.setTitle(title);
		article.setBody(body);
	}

	public List<Article> getArticles() {
		return articles;
	}

	
	// 서비스 메서드 끝



}
