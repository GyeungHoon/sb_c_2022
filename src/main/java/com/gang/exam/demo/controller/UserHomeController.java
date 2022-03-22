package com.gang.exam.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	
	@RequestMapping("/urs/home/main")
	@ResponseBody
	public String getString() {
		return "안녕하세요";
	}
	

	
	
	
	
	
	
}