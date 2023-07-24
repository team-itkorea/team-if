package com.example.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProgramController {

	@GetMapping("/program")
	public String programMain() {
		return "/Kim/program";
	}
	
}
