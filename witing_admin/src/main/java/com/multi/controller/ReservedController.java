package com.multi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.multi.dto.Msg;
import com.multi.dto.ReservationDTO;
import com.multi.service.ReservationService;



@Controller
public class ReservedController {
	
	@Autowired
	SimpMessagingTemplate template;

	@Autowired
	ReservationService service;

	@MessageMapping("/reservedcheck")
	public void reservedcheck(ReservationDTO check, SimpMessageHeaderAccessor headerAccessor) {
		try {
			List<ReservationDTO> list = service.reserved(check.getYear(), check.getMonth(), check.getRoomid());
			template.convertAndSend("/reservedresult", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

