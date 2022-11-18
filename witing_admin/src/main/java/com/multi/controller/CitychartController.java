package com.multi.controller;

import java.sql.Date;
import java.util.List;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.AdmDTO;
import com.multi.dto.CitychartDTO;
import com.multi.dto.CustDTO;
import com.multi.service.CitychartService;
import com.multi.service.CustService;

@RestController
public class CitychartController {
	
	@Autowired
	CitychartService service;
	
	@RequestMapping("/citychart")
	public Object citychart() {
		JSONArray data = new JSONArray();
		try {
			List<CitychartDTO> list = service.getall();
			int[] cnt = new int[9];
			for(CitychartDTO c : list) {
				cnt[c.getCityid()-1] = c.getReservcnt();
			}
			for(int i=0; i<9; i++) {
				data.add(cnt[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data; 
	}
}
