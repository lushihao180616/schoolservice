package com.lushihao.service.dao;

import com.lushihao.service.activity.ActivityBeautifulGreat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityBeautifulGreatMapper {

    int insertOne(ActivityBeautifulGreat activityBeautifulGreat);

    int deleteOne(ActivityBeautifulGreat activityBeautifulGreat);

    List<ActivityBeautifulGreat> selectMy(ActivityBeautifulGreat activityBeautifulGreat);

    int selectOwner(ActivityBeautifulGreat activityBeautifulGreat);

}
