package com.lushihao.service.service;

import com.lushihao.service.bean.ConfessionWall;
import com.lushihao.service.bean.User;
import com.lushihao.service.common.Image;
import com.lushihao.service.common.ModelType;
import com.lushihao.service.dao.ConfessionWallMapper;
import com.lushihao.service.dao.ImageMapper;
import com.lushihao.service.dao.UserMapper;
import com.lushihao.service.util.BeanMapUtil;
import com.lushihao.service.util.ImageUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ConfessionWallService {

    @Resource
    private ConfessionWallMapper confessionWallMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private ImageMapper imageMapper;

    @Transactional
    public int insertOne(ConfessionWall confessionWall) {
        return confessionWallMapper.insertOne(confessionWall);
    }

    @Transactional
    public int deleteOne(ConfessionWall confessionWall) {
        return confessionWallMapper.deleteOne(confessionWall);
    }

    /**
     * 查表白墙
     *
     * @return
     */
    @Transactional
    public List<Map> selectLimit() {
        List<Map> result = new ArrayList<>();
        List<ConfessionWall> selectConfession = confessionWallMapper.selectLimit();
        for (ConfessionWall wallItem : selectConfession) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(wallItem);
            if (StringUtils.isNotEmpty(wallItem.getStuNum())) {
                User user = new User();
                user.setStuNum(wallItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            Image image = new Image();
            image.setType("00");
            image.setTypeId(wallItem.getId());
            Image selectImage = imageMapper.selectOne(image);
            map.put("imageDivideNumber", ImageUtil.getHeightDivideWidth(selectImage.getSrc()));
            map.put("image", selectImage);
            result.add(map);
        }
        return result;
    }

    /**
     * 查我发布的表白墙
     *
     * @return
     */
    @Transactional
    public List<Map> selectMyLimit(ConfessionWall confessionWall) {
        List<Map> result = new ArrayList<>();
        List<ConfessionWall> selectConfession = confessionWallMapper.selectMyLimit(confessionWall);
        for (ConfessionWall wallItem : selectConfession) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(wallItem);
            if (StringUtils.isNotEmpty(wallItem.getStuNum())) {
                User user = new User();
                user.setStuNum(wallItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            Image image = new Image();
            image.setType(ModelType.MODEL_CONFESSIONWALL);
            image.setTypeId(wallItem.getId());
            map.put("image", imageMapper.selectOne(image));
            result.add(map);
        }
        return result;
    }

}
