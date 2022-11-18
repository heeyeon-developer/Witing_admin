package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CitychartDTO;
import com.multi.dto.CustDTO;
import com.multi.frame.MyService;
import com.multi.mapper.CitychartMapper;
import com.multi.mapper.CustMapper;

@Service
public class CitychartService implements MyService<Integer, CitychartDTO>{
	
	@Autowired
	CitychartMapper mapper;

	@Override
	public void register(CitychartDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(CitychartDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public CitychartDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<CitychartDTO> getall() throws Exception {
		return mapper.selectall(); 
	}

}
