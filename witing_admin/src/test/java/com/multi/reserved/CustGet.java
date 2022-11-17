package com.multi.reserved;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.dto.ReservationDTO;
import com.multi.service.CustService;
import com.multi.service.ReservationService;

@SpringBootTest
class CustGet {

	@Autowired
	ReservationService service;
	
	@Test
	void contextLoads() {
		try {
			List<ReservationDTO> list = service.reserved(2022, 10, 7);
			for(ReservationDTO re : list)
				System.out.println(re);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
