package br.com.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting","Welcome to Web Store!");
		model.addAttribute("tagline", "The one and amazing store");
		
		return "welcome";
	}
	
}
