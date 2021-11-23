package com.han.S20210901.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllerHg {
	//Git hub test입니다. 
	//Git hub Branch Test
	@GetMapping(value="main")
	public String main() {
		
		return "main";
	}
}
