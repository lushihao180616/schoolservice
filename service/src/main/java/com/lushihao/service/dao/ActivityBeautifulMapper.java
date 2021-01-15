package com.lushihao.service.dao;

import com.lushihao.service.activity.ActivityBeautiful;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityBeautifulMapper {

    int insertOne(ActivityBeautiful activityBeautiful);

    int deleteOne(ActivityBeautiful activityBeautiful);

    ActivityBeautiful selectOne(ActivityBeautiful activityBeautiful);

    List<ActivityBeautiful> selectLimit();

}
