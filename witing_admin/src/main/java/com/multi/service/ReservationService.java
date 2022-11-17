package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.ReservationDTO;
import com.multi.mapper.ReservationMapper;

@Service
public class ReservationService {

	@Autowired
	ReservationMapper mapper;

	public List<ReservationDTO> reserved(Integer year,Integer month, Integer roomid) throws Exception {
		return mapper.reserved(year, month, roomid);
	}

}
