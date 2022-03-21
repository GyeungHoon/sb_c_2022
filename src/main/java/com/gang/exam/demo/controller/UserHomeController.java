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
	
	@RequestMapping("/urs/home/main")
	@ResponseBody
	public String getString() {
		return "안녕하세요";
	}
	

	
	
	
	
	
	
}