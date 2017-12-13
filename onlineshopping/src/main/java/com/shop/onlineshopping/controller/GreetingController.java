package com.shop.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController
{
	
	@RequestMapping(value= {"/","/home"})
	public ModelAndView greet()
	{
		return new ModelAndView("page","greet","Welcome to the Online shopping!");
	}



	@RequestMapping(value= "/test")
	public ModelAndView test()
	{
		return new ModelAndView("page","greet","Welcome to the Online shopping!");
	}



}
