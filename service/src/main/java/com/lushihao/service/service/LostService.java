package com.lushihao.service.service;

import com.lushihao.service.bean.Lost;
import com.lushihao.service.dao.LostMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LostService {

    @Resource
    private LostMapper lostMapper;

    @Transactional
    public int insertOne(Lost lost) {
        return lostMapper.insertOne(lost);
    }

    @Transactional
    public int deleteOne(Lost lost) {
        return lostMapper.deleteOne(lost);
    }

    @Transactional
    public List<Lost> selectAll() {
        return lostMapper.selectAll();
    }

}
