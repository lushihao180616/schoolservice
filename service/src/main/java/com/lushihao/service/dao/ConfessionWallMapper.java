package com.lushihao.service.dao;

import com.lushihao.service.bean.ConfessionWall;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ConfessionWallMapper {

    int insertOne(ConfessionWall confessionWall);

    int deleteOne(ConfessionWall confessionWall);

    List<ConfessionWall> selectLimit(@Param("id") int id);

    List<ConfessionWall> selectMyLimit(ConfessionWall confessionWall);

}
