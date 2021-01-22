package com.lushihao.service.dao;

import com.lushihao.service.common.Video;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VideoMapper {

    int insertOne(Video video);

    int deleteOne(Video video);

    Video selectOne(Video video);

}
