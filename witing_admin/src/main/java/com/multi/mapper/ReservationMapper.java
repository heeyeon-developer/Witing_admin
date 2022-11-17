package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.ReservationDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface ReservationMapper {
	public List<ReservationDTO> reserved(Integer year,Integer month, Integer roomid) throws Exception;
}
