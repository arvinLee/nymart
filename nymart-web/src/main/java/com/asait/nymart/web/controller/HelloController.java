package com.asait.nymart.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.asait.nymart.web.App;

public class HelloController implements Controller{
	
	private App app;

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String user = req.getParameter("user");
		
		ModelAndView view = new ModelAndView("hi.jsp");
		view.addObject("user", user);
		app.sayHi(user);
		System.out.println(this);
		return view;
	}

	public void setApp(App app) {
		this.app = app;
	}
	
}
