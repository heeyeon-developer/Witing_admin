package com.multi.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@Controller
@RequestMapping("/cust")
public class CustController {
	
	String dir = "cust/";
	
	@Autowired
	CustService service;
	
	@RequestMapping("/registercust")
	public String main(Model model) {
		model.addAttribute("center", dir+"registercust");
		return "index";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, String custid, String custpwd, String custname, String birth, String phone, String email, String addr, String addrdetail, Integer zipcode, String gender, String country) throws Exception {
		CustDTO cust = new CustDTO(custid, custpwd, custname, Date.valueOf(birth),phone,email,addr,addrdetail,zipcode,null,gender,1000,country,null);
		try {
			service.register(cust);
			model.addAttribute("name", cust.getCustname());
		} catch (Exception e) {
			throw new Exception("ID 중복 에러");
		}
		return "redirect:getcust";
	}
	
	@RequestMapping("/getcust")
	public String getcust(Model model) {
		List<CustDTO> list = null;
		try {
			list = service.getall();
			model.addAttribute("list", list);
			model.addAttribute("center", dir+"getcust");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model model, String custid) {
		CustDTO cust = null;
		try {
			cust = service.get(custid);
			model.addAttribute("c", cust);
			model.addAttribute("center", dir+"detail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/update")
	public String update(Model model, CustDTO cust) {
		try {
			service.modify(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?custid="+cust.getCustid();
	}
	
	@RequestMapping("/delete")
	public String delete(Model model, String custid) {
		try {
			service.remove(custid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:getcust";
	}
	
}
