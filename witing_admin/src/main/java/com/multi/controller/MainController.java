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
	
	@RequestMapping("/sockettest")
	public String sokettest(Model model) {
		try {
			model.addAttribute("center","websocket");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/mypage")
	public String mypage(Model model, String adminid) {
		AdmDTO adm = null;
		try {
			adm = service.get(adminid);
			
			model.addAttribute("adm", adm);
			model.addAttribute("center", "mypage");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/admupdateimpl")
	public String admupdateimpl(Model model, AdmDTO adm) {

		try {
			service.modify(adm);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:mypage?adminid="+adm.getAdminid();
	}
}
