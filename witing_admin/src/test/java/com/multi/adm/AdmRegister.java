package com.multi.adm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.AdmDTO;
import com.multi.service.AdmService;

@SpringBootTest
class AdmRegister {

	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		try {
			service.register(new AdmDTO("hyadm","testpwd"));
			System.out.println(service.getall());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
