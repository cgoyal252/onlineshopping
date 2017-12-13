package com.shop.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	
	@RequestMapping(value= {"/","/home"})
	public ModelAndView homePage()
	{
		
		
		ModelAndView model=new ModelAndView("page","title","Home");
		model.addObject("clickHome",true);
		return  model;
	}


	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		
		
		ModelAndView model=new ModelAndView("page","title","About Us");
		model.addObject("clickAbout",true);
		return  model;
	}
	

	@RequestMapping(value="/product")
	public ModelAndView viewProduct()
	{
		
		
		ModelAndView model=new ModelAndView("page","title","viewProduct");
		model.addObject("clickProduct",true);
		return  model;
	}

	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		
		
		ModelAndView model=new ModelAndView("page","title","Contact Us");
		model.addObject("clickContact",true);
		return  model;
	}
	

}
