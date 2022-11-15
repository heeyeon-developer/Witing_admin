package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@Controller
public class LoginController {
	
	@Autowired
	CustService cust_service;

	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("center","login");
		return "index";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model model, String id, String pwd) {
		
		try {
			CustDTO cust = cust_service.get(id);
			if(cust.getCustpwd().equals(pwd)) {
				model.addAttribute("center","maincenter");
			}else {
				model.addAttribute("center","loginfail");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";
	}
}
