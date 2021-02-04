package com.lushihao.service.dao;

import com.lushihao.service.common.Great;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GreatMapper {

    int insertOne(Great great);

    int deleteOne(Great great);

    Great selectOne(Great great);

    List<Great> selectMyLimit(Great great);

}
