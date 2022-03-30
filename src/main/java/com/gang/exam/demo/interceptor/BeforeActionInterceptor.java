package com.gang.exam.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.gang.exam.demo.service.MemberService;
import com.gang.exam.demo.vo.Rq;

@Component
public class BeforeActionInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
		// 이제는 Rq 객체가 자동으로 만들어지기 때문에 필요없음
		
		return HandlerInterceptor.super.preHandle(req, resp, handler);
	}
	
}
