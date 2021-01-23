package com.lushihao.service.service;

import com.lushihao.service.common.Image;
import com.lushihao.service.dao.ImageMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ImageService {

    @Resource
    private ImageMapper imageMapper;

    @Transactional
    public int insertOne(Image image) {
        return imageMapper.insertOne(image);
    }

    @Transactional
    public int deleteOne(Image image) {
        return imageMapper.deleteOne(image);
    }

}
