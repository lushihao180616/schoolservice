package com.lushihao.service.dao;

import com.lushihao.service.activity.ActivityImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityImageMapper {

    int insertOne(ActivityImage activityImage);

    int deleteOne(ActivityImage activityImage);

    List<ActivityImage> selectMy(ActivityImage activityImage);

}
