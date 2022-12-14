package com.multi.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.SaleschartDTO;
import com.multi.mapper.SaleschartMapper;

@RestController
public class SaleschartController {
	@Autowired
	SaleschartMapper mapper;
	
	@RequestMapping("/saleschart")
	public Object saleschart() {
		JSONObject result = new JSONObject();	// 최종 결과 데이터 담을 JSONObject
		List<SaleschartDTO> list = null;
		list = mapper.saleschart();
		
		JSONArray totalprice_ja = new JSONArray();
		JSONArray month_ja = new JSONArray();
		
		int m = 0;
		
		for(SaleschartDTO c:list) {
			totalprice_ja.add(c.getTotalprice());
			m++;
			month_ja.add(m);
		}
		
		
		// [{},{}]
		// {"month":[1,2,3,4,5,6], "result":[]}
		result.put("month", month_ja);
		result.put("result", totalprice_ja);
		return result;
	}
}
