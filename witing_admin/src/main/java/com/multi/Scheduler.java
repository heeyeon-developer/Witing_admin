package com.multi;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.multi.dto.Msg;
import com.multi.dto.ReservationDTO;
import com.multi.service.ReservationService;

@Component
public class Scheduler {
	@Autowired
	private SimpMessageSendingOperations messagingTemplate;
    @Autowired
    ReservationService service;
    
//	@Scheduled(cron = "*/15 * * * * *")
//	public void MyScheduler2() {
//		System.out.println("Start My Scheduler 2.....");
//        Random r = new Random();
//        int n1 = r.nextInt(100)+1;
//        int n2 = r.nextInt(100)+1;
//      
//        Msg msg = new Msg();
//        msg.setSendid("Server");
//        msg.setReceiveid("All");
//        msg.setContent1(n1+"");
//        msg.setContent2(n2+"");
//        messagingTemplate.convertAndSend("/broadcast", msg);
//      
//        System.out.println("End My Scheduler 2.....");
//    }
   
//	@Scheduled(cron = "* * * * * *")
//    public void ReservedScheduler() {
//		System.out.println("Start Get Reservation .....");
//		try {
//			List<ReservationDTO> list = service.reserved(10, 7);
//			messagingTemplate.convertAndSend("/reserved", list);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//      
//      System.out.println("End Get Reservation .....");
//   }
	
}
