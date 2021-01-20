package com.lushihao.service.dao;

import com.lushihao.service.common.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    int insertOne(Comment comment);

    int deleteOne(Comment comment);

    List<Comment> selectMyLimit(Comment comment);

}
