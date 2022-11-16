package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.PostDTO;
import com.multi.service.CustService;
import com.multi.service.PostService;

@Controller
public class QnAController {
	@Autowired
	CustService custservice;
	@Autowired
	PostService postservice;
	
	@RequestMapping("/qna")
	public String qna(Model model) {
		List<PostDTO> list = null;
		try {
			list = postservice.questall();
			model.addAttribute("list", list);
			model.addAttribute("center", "qna");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/qnadetail")
	public String qnadetail(Model model, int postid) {
		PostDTO post = null;
		try {
			post = postservice.get(postid);
			model.addAttribute("qnadetail", post);
			model.addAttribute("center", "qnadetail");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
}
