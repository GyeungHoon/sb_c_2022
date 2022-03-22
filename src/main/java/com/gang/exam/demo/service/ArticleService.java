package com.gang.exam.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gang.exam.demo.repository.ArticleRepository;
import com.gang.exam.demo.vo.Article;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
		makeTestData();
	}
	public void makeTestData() {
		
		for(int i=1; i<=10; i++) {
	
			String title = "제목" +i;
			String body = "내용" +i;
			writeArticle(title,body);
		}
		
	}
	public Article writeArticle(String title, String body) {
			
		return articleRepository.writeArticle(title, body);
	}
	public List<Article> getArticles() {
		
		return articleRepository.getArticles();
	}
	public Article getArticle(int id) {
		
		return articleRepository.getArticle(id);
	}
	public void deleteArticle(int id) {
		articleRepository.deleteArticle(id);
		
	}
	public void modifyArticle(int id, String title, String body) {
		articleRepository.modifyArticle(id, title, body);
		
	}
	
		}
