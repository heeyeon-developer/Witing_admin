package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.PostDTO;
import com.multi.frame.MyService;
import com.multi.mapper.PostMapper;




@Service
public class PostService implements MyService<Integer, PostDTO>{
	@Autowired
	PostMapper mapper;

	@Override
	public void register(PostDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(PostDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public PostDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<PostDTO> getall() throws Exception {
		return mapper.selectall();
	}
	
	
	public List<PostDTO> hotelqnaall(int hotelid) throws Exception {
		return mapper.hotelqnaall(hotelid);
	}

	public PostDTO selectanswer(int postid) throws Exception {
		return mapper.selectanswer(postid);
	}
	public PostDTO answercheck(int toppostid) throws Exception {
		return mapper.answercheck(toppostid);
	}
	
	public PostDTO reviewdetail(int postid) throws Exception {
		return mapper.reviewdetail(postid);
	}
	
	public List<PostDTO> hotelreviewall(int hotelid) throws Exception {
		return mapper.hotelreviewall(hotelid);
	}
	public List<PostDTO> questall() throws Exception{
		return mapper.questall();
	}
	public void answerinsert(PostDTO v) throws Exception {
		mapper.answerinsert(v);
	}
	public PostDTO qnadetail(int postid) throws Exception {
		return mapper.qnadetail(postid);
	}
	public int qnacnt() throws Exception{
		return mapper.qnacnt();
	}
	
	
}
