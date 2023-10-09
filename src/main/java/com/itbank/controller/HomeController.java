package com.itbank.controller;

import com.itbank.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private TestService testService;

	@Autowired
	public HomeController(TestService testService) {
		this.testService = testService;
	}

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("version", testService.getVersion());
		return mav;
	}

	@GetMapping("/callback")
	public void callback() {
	}

	@GetMapping("/login")
	public void login() {
	}
}
