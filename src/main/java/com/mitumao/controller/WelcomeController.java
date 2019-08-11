package com.mitumao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {
	@RequestMapping("/bms")
	public String welcome() {
		return "thymeleaf/welcome";
	}
}
