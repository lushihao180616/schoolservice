package com.lushihao.service.dao;

import com.lushihao.service.common.Dormitory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DormitoryMapper {

    List<Dormitory> selectAll();

    Dormitory selectOne(Dormitory dormitory);

}
