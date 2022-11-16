package com.multi.adm;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.AdmDTO;
import com.multi.service.AdmService;

@SpringBootTest
class AdmGetId {

	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		try {
			AdmDTO adm = service.get("adm1");
			System.out.println(adm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
