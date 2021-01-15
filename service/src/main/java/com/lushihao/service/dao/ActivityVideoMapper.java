package com.lushihao.service.dao;

import com.lushihao.service.activity.ActivityVideo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActivityVideoMapper {

    int insertOne(ActivityVideo activityVideo);

    int deleteOne(ActivityVideo activityVideo);

    ActivityVideo selectOne(ActivityVideo activityVideo);

}
