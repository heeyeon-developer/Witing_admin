package com.multi.citychart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CitychartDTO;
import com.multi.service.CitychartService;

@SpringBootTest
class CitychartGet {

	@Autowired
	CitychartService service;
	
	@Test
	void contextLoads() {
		try {
			List<CitychartDTO> list = service.getall();
			for(CitychartDTO reserv : list)
				System.out.println(reserv);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
