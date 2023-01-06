package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	// get and post
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String GotoWelcomePage(ModelMap model) {
		model.put("name","sara");
		return "welcome";
	}
}