package com.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req , HttpServletResponse res){
		
		ModelAndView mv = new ModelAndView();
		
		int t1= Integer.parseInt(req.getParameter("t1"));
		int t2= Integer.parseInt(req.getParameter("t2"));
		
		mv.setViewName("result.jsp");
		mv.addObject("result", t1+t2);
		
		return mv;
	}
}
