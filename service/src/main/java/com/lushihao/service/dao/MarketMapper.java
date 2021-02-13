package com.lushihao.service.dao;

import com.lushihao.service.bean.Market;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MarketMapper {

    int insertOne(Market market);

    int deleteOne(Market market);

    List<Market> selectLimit(@Param("id") int id);

    List<Market> selectMyLimit(@Param("stuNum") String stuNum, @Param("id") int id);

}
