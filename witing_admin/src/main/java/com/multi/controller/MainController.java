package com.multi.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.AdmDTO;
import com.multi.dto.CustDTO;
import com.multi.service.AdmService;

@Controller
public class MainController {

	@Autowired
	AdmService service;
	
	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("center","maincenter");
		return "index";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, AdmDTO adm) {
		try {
			service.register(adm);
			model.addAttribute("name",adm.getAdminid());
			model.addAttribute("center","registerok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
}
