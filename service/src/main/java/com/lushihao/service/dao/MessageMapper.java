package com.lushihao.service.dao;

import com.lushihao.service.common.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {

    int insertOne(Message message);

    int deleteOne(Message message);

    List<Message> selectMyLimit(Message message);

}
