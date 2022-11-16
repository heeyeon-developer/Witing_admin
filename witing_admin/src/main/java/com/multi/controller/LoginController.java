package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.AdmDTO;
import com.multi.dto.CustDTO;
import com.multi.service.AdmService;
import com.multi.service.CustService;

@Controller
public class LoginController {
	
	@Autowired
	AdmService adm_service;

	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("center","login");
		return "index";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model model, String id, String pwd, HttpSession session) {
		
		try {
			AdmDTO adm = adm_service.get(id);
			model.addAttribute("center","maincenter");
			session.setAttribute("loginadm", adm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		if(session != null)
			session.invalidate();
		return "redirect:";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center","register");
		return "index";
	}
}
