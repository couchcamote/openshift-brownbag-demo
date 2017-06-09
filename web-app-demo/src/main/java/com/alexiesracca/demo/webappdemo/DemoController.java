package com.alexiesracca.demo.webappdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	// inject via application.properties
	@Value("${index.message:test}")
	private String message = "Hello World";
	
	@Value("${welcome.message:test}")
	private String welcomeMessage = "Hello World";
	
	@Value("${about.message:test}")
	private String aboutMessage = "Hello World";
	
	@Value("${index.title:test}")
	private String messageTitle = "Hello World";
	
	@Value("${welcome.title:test}")
	private String welcomeTitle = "Hello World";
	
	@Value("${about.title:test}")
	private String aboutTitle = "Hello World";

	@RequestMapping("/")
	public String root(Map<String, Object> model) {
		model.put("message", this.message);
		model.put("title", this.messageTitle);
		System.out.println("ROOT  mesasge "+ message);
	return "index";
	}

	@RequestMapping("/welcome")
	public String test(Map<String, Object> model) {
		model.put("message", this.welcomeMessage);
		model.put("title", this.welcomeTitle);
		System.out.println("TEST: mesasge "+ welcomeMessage);
	return "welcome";
	}
	
	@RequestMapping("/about")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.aboutMessage);
		model.put("title", this.aboutTitle);
		System.out.println("About: mesasge "+ aboutMessage);
	return "about";
	}
	

}