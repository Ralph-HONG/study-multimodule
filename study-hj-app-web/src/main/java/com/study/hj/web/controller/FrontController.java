package com.study.hj.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class FrontController {

	@GetMapping("/hello")
	public String test() {
		System.out.println("호출됨");

		return "여기는 스프링입니다";
	}
}
