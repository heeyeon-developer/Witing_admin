package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.SaleschartDTO;

@Mapper
@Repository
public interface SaleschartMapper {
	public List<SaleschartDTO> saleschart();
}
