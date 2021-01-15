package com.lushihao.service.dao;

import com.lushihao.service.activity.ActivityImage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActivityImageMapper {

    int insertOne(ActivityImage activityImage);

    int deleteOne(ActivityImage activityImage);

    ActivityImage selectOne(ActivityImage activityImage);

}
