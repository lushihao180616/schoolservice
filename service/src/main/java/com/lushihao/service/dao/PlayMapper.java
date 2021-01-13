package com.lushihao.service.dao;

import com.lushihao.service.bean.Play;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlayMapper {

    int insertOne(Play play);

    int deleteOne(Play play);

    List<Play> selectAll();

}
