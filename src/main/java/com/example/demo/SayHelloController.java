package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	@RequestMapping("say-hello")
	@ResponseBody
	public String SayHello() {
		return "hello";
	}
	@RequestMapping("say-hello-jsp")
    public String SayHelloHtml() {
		return "SayHello";
	}
}
