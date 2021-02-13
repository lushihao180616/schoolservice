package com.lushihao.service.service;

import com.lushihao.service.common.Audio;
import com.lushihao.service.dao.AudioMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AudioService {

    @Resource
    private AudioMapper audioMapper;

    @Transactional
    public int insertOne(Audio audio) {
        return audioMapper.insertOne(audio);
    }

    @Transactional
    public int deleteOne(Audio audio) {
        return audioMapper.deleteOne(audio);
    }

}
