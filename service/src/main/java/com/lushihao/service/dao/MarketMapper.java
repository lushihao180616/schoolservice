package com.lushihao.service.dao;

import com.lushihao.service.bean.Lost;
import com.lushihao.service.bean.Market;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MarketMapper {

    int insertOne(Market market);

    int deleteOne(Market market);

    List<Market> selectLimit();

    List<Market> selectMyLimit(Market market);

}