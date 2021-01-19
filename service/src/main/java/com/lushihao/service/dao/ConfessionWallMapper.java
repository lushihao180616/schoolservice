package com.lushihao.service.dao;

import com.lushihao.service.bean.ConfessionWall;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConfessionWallMapper {

    int insertOne(ConfessionWall confessionWall);

    int deleteOne(ConfessionWall confessionWall);

    List<ConfessionWall> selectLimit();

    List<ConfessionWall> selectMyLimit(ConfessionWall confessionWall);

}
