package com.leafqun.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leafqun.entity.User;
import com.leafqun.service.UserService;


@Controller
public class HelloController {

	@Autowired
	private UserService userService;
	@RequestMapping("/hello")
	public String hello(Model model){
		User user=userService.selectByPrimaryKey(2);
		model.addAttribute("message",user );
		return "hello";
	}
}
