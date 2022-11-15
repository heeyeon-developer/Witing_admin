package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.AdmDTO;
import com.multi.frame.MyMapper;

@Mapper
@Repository
public interface AdmMapper extends MyMapper<String,AdmDTO>{

}
