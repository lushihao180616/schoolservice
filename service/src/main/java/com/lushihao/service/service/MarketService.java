package com.lushihao.service.service;

import com.lushihao.service.bean.Market;
import com.lushihao.service.dao.MarketMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MarketService {

    @Resource
    private MarketMapper marketMapper;

    @Transactional
    public int insertOne(Market market) {
        return marketMapper.insertOne(market);
    }

    @Transactional
    public int deleteOne(Market market) {
        return marketMapper.deleteOne(market);
    }

    @Transactional
    public List<Market> selectAll() {
        return marketMapper.selectAll();
    }

}
