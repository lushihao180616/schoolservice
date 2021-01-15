package com.lushihao.service.dao;

import com.lushihao.service.activity.ActivityVideo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityVideoMapper {

    int insertOne(ActivityVideo activityVideo);

    int deleteOne(ActivityVideo activityVideo);

    List<ActivityVideo> selectMy(ActivityVideo activityVideo);

}
