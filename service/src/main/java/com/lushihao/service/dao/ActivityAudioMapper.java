package com.lushihao.service.dao;

import com.lushihao.service.activity.ActivityAudio;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActivityAudioMapper {

    int insertOne(ActivityAudio activityAudio);

    int deleteOne(ActivityAudio activityAudio);

    ActivityAudio selectOne(ActivityAudio activityAudio);

}
