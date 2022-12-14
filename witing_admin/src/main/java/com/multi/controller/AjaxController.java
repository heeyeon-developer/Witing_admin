package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.AdmDTO;
import com.multi.dto.CustDTO;
import com.multi.service.AdmService;
import com.multi.service.CustService;

@RestController
public class AjaxController {

	@Autowired
	AdmService adm_service;
	
	@RequestMapping("/logincheck")
	public Object idcheck(String id, String pwd) {
		boolean result = true;
		try {
			AdmDTO cust = adm_service.get(id);
			if(cust == null || !cust.getAdminpwd().equals(pwd)) {
				result = false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	@RequestMapping("/idcheck")
	public Object idcheck(String id) {
		boolean result = true;
		try {
			List<AdmDTO> list = adm_service.getall();
			for(AdmDTO adm : list) {
				if(id.equals(adm.getAdminid())) {
					result = false;
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}    
	
}
