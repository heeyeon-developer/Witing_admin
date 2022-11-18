package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CitychartDTO;
import com.multi.frame.MyMapper;

@Mapper
@Repository
public interface CitychartMapper extends MyMapper<Integer,CitychartDTO>{
}
