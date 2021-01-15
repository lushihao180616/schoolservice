package com.lushihao.service.dao;

import com.lushihao.service.activity.ActivityBeautiful;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActivityBeautifulMapper {

    int insertOne(ActivityBeautiful activityBeautiful);

    int deleteOne(ActivityBeautiful activityBeautiful);

    ActivityBeautiful selectOne(ActivityBeautiful activityBeautiful);

}
