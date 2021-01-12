package com.lushihao.service.dao;

import com.lushihao.service.bean.ConfessionWall;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConfessionWallMapper {

    int insertOne(ConfessionWall confessionWall);

    int deleteOne(ConfessionWall confessionWall);

}
