package com.multi.cust;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class CustInsert {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		try {
			CustDTO cust = new CustDTO("abc", "Ab1234!", "배단비", Date.valueOf("1997-11-11"), "010-1111-1111", "abc123@witing.com", "제주도", "7층", 12345, null, "woman", 0, "Korea",null);
			System.out.println(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
