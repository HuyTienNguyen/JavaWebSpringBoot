package com.springboot.app.controller.admin;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/admin/user")
public class UserController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("frontend/user/index");
		return modelAndView;

	}
	@RequestMapping("/add")
	public ModelAndView add() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("frontend/user/add");
		return modelAndView;

	}
	@RequestMapping("/edit")
	public ModelAndView edit() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("frontend/user/edit");
		return modelAndView;

	}

}
