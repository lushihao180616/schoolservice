package com.lushihao.service.dao;

import com.lushihao.service.common.Image;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ImageMapper {

    int insertOne(Image image);

    int deleteOne(Image image);

    Image selectOne(Image image);

}
