package com.gang.exam.demo.controller;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gang.exam.demo.vo.Article;

@Controller
public class UserHomeController {
	
	@RequestMapping("/urs/home/getString")
	@ResponseBody
	public String getString() {
		return "HI";
	}
	
	@RequestMapping("/urs/home/getInt")
	@ResponseBody
	public int getInt() {
		return 10;
	}
	@RequestMapping("/urs/home/getFloat")
	@ResponseBody
	public float getFloat() {
		return 10.5f;
	}
	@RequestMapping("/urs/home/getDouble")
	@ResponseBody
	public double getDouble() {
		return 10.5;
	}
	@RequestMapping("/urs/home/getBoolean")
	@ResponseBody
	public boolean getBoolean() {
		return true;
	}
	@RequestMapping("/urs/home/getCharacter")
	@ResponseBody
	public char getCharacter() {
		return 'a';
	}
	
	@RequestMapping("/urs/home/getMap")
	@ResponseBody
	public Map getMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("철수나이", 22);
		map.put("영희나이", 33);
		return map;
	}
	
	@RequestMapping("/urs/home/getList")
	@ResponseBody
	public List<String> getList() {
		List<String> list = new ArrayList<>();
		list.add("철수나이");
		list.add("영희나이");
		return list;
	}
	
	@RequestMapping("/urs/home/getArticle")
	@ResponseBody
	public Article getArticle() {
		Article article= new Article();
	
		return article;
	}
	
	@RequestMapping("/urs/home/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		Article article1 = new Article(1, "제목1", "제목1");
		Article article2 = new Article(2, "제목2", "제목1");
		
		List<Article> list = new ArrayList<>();
		
		list.add(article1);
		list.add(article2);
		
		return list;
	}
	
	
	
	
	
	
}