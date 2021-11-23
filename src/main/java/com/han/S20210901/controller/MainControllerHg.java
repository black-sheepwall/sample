package com.han.S20210901.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllerHg {
	
	@GetMapping(value="main")
	public String test1() {
		
		return "main";
	}
}
