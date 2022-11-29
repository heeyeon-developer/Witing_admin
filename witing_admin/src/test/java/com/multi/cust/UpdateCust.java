package com.multi.cust;

import java.sql.Date;

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
		
		CustDTO cust = new CustDTO("abc","Ab1234!!", "배단비", Date.valueOf("1997-11-11"), "010-1111-1111", "abc123@witing.com", "제주도", "7층", 12345, null, "woman", 0, "Korea",null);

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