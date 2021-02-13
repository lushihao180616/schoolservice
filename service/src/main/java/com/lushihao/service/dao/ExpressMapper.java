package com.lushihao.service.dao;

import com.lushihao.service.bean.Express;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExpressMapper {

    int insertOne(Express express);

    int deleteOne(Express express);

    List<Express> selectMyLimit(@Param("stuNum") String stuNum, @Param("id") int id);

}
