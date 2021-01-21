package com.lushihao.service.dao;

import com.lushihao.service.common.Audio;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AudioMapper {

    int insertOne(Audio audio);

    int deleteOne(Audio audio);

    Audio selectOne(Audio audio);

}
