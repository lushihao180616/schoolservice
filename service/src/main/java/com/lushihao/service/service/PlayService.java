package com.lushihao.service.service;

import com.lushihao.service.bean.Play;
import com.lushihao.service.dao.PlayMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlayService {

    @Resource
    private PlayMapper playMapper;

    @Transactional
    public int insertOne(Play play) {
        return playMapper.insertOne(play);
    }

    @Transactional
    public int deleteOne(Play play) {
        return playMapper.deleteOne(play);
    }

    @Transactional
    public List<Play> selectAll() {
        return playMapper.selectAll();
    }

}
