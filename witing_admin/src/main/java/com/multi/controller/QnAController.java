package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.multi.service.CustService;

@Controller
public class QnAController {
	@Autowired
	CustService custservice;
	
}
