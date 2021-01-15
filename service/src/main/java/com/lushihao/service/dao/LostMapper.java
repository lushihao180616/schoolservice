package com.lushihao.service.dao;

import com.lushihao.service.bean.Lost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LostMapper {

    int insertOne(Lost lost);

    int deleteOne(Lost lost);

    List<Lost> selectLimit();

}
