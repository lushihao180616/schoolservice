package com.lushihao.service.service;

import com.lushihao.service.bean.ConfessionWall;
import com.lushihao.service.dao.ConfessionWallMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConfessionWallService {

    @Resource
    private ConfessionWallMapper confessionWallMapper;

    @Transactional
    public int insertOne(ConfessionWall confessionWall) {
        return confessionWallMapper.insertOne(confessionWall);
    }

    @Transactional
    public int deleteOne(ConfessionWall confessionWall) {
        return confessionWallMapper.deleteOne(confessionWall);
    }

    @Transactional
    public List<ConfessionWall> selectAll() {
        return confessionWallMapper.selectAll();
    }

}
