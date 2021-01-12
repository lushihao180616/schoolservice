package com.lushihao.service.dao;

import com.lushihao.service.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    int insertOne(User user);

    int updateOne(User user);

    int updatePwd(User user);

    List<User> selectAll();

    List<User> selectAllManage();

    int manageUser(User user);

    User selectOne(User user);

}
