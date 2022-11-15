package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@RestController
public class AjaxController {

	@Autowired
	CustService cust_service;
	
	@RequestMapping("/logincheck")
	public Object idcheck(String id, String pwd) {
		boolean result = true;
		try {
			CustDTO cust = cust_service.get(id);
			System.out.println(id);
			if(cust == null || !cust.getCustpwd().equals(pwd)) {
				result = false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
