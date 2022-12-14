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
	String dir = "qna/";
	
	@Autowired
	CustService custservice;
	@Autowired
	PostService postservice;
	
	@RequestMapping("/qna")
	public String qna(Model model) {
		List<PostDTO> list = null;
		try {
			list = postservice.questall();
			for(int i=0; i<list.size(); i++) {
				if(postservice.answercheck(list.get(i).getPostid()) != null) {
					list.get(i).setAnswer("답변완료");
				}else {
					list.get(i).setAnswer("미완료");
				}
			}
			model.addAttribute("list", list);
			model.addAttribute("center", dir+"qna");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/qnadetail")
	public String qnadetail(Model model, int postid) {
		int toppostid = postid;
		PostDTO post = null;
		PostDTO answer = null;
		try {
			post = postservice.qnadetail(postid);
			answer = postservice.selectanswer(toppostid);
			model.addAttribute("qnadetail", post);
			model.addAttribute("answer", answer);
			model.addAttribute("center", dir+"qnadetail");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	@RequestMapping("/answersendimpl")
	public String answersnedimpl(Model model, PostDTO answer) {
		try {
			postservice.answerinsert(answer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:qna";
	}
}
