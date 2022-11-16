package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class UpdateCust {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		
		CustDTO cust = new CustDTO("dbb", "ddd", "ddd", null, "01033333333", "dd@dddddd", "경기도", "1층", 12345, null, "woman", 12345, "Korea");
		try {
			service.modify(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update OK");
	}

}
// test
// test2