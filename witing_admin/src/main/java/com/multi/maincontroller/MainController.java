package com.multi.maincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("center","maincenter");
		return "index";
	}
}
