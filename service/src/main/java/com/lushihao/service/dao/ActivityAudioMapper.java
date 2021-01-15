package com.lushihao.service.dao;

import com.lushihao.service.activity.ActivityAudio;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityAudioMapper {

    int insertOne(ActivityAudio activityAudio);

    int deleteOne(ActivityAudio activityAudio);

    List<ActivityAudio> selectMy(ActivityAudio activityAudio);

}
