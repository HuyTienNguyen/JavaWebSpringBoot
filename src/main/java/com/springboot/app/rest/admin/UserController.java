package com.springboot.app.rest.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/admin/user")
public class UserController {

	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("views/admin-user/index");
		return modelAndView;

	}
	@RequestMapping("/add")
	public ModelAndView add() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("views/admin-user/add");
		return modelAndView;

	}
	@RequestMapping("/edit")
	public ModelAndView edit() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("views/admin-user/edit");
		return modelAndView;

	}

}
