package com.example.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProgramController {

	@GetMapping("/program")
	public String program_Main() {
		return "/Kim/program";
	}
	
	@GetMapping("/templates/Kim/program-l.html")
	public String program_Leisure() {
		return "/Kim/program-l";
	}
	
	@GetMapping("/templates/Kim/program-w.html")
	public String program_Wellness() {
		return "/Kim/program-w";
	}
}
