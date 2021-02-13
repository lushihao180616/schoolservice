package com.lushihao.service.service;

import com.lushihao.service.bean.ConfessionWall;
import com.lushihao.service.bean.User;
import com.lushihao.service.common.Comment;
import com.lushihao.service.common.Great;
import com.lushihao.service.common.Image;
import com.lushihao.service.common.ModelType;
import com.lushihao.service.dao.*;
import com.lushihao.service.util.BeanMapUtil;
import com.lushihao.service.util.DateUtil;
import com.lushihao.service.util.ImageUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.File;
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
    @Resource
    private GreatMapper greatMapper;
    @Resource
    private CommentMapper commentMapper;

    /**
     * 插入表白墙
     *
     * @param confessionWall
     * @return
     */
    @Transactional
    public int insertOne(ConfessionWall confessionWall) {
        confessionWall.setCreateTime(DateUtil.nowyMdHms());
        if (confessionWallMapper.insertOne(confessionWall) > 0) {
            return confessionWall.getId();
        }
        return 0;
    }

    /**
     * 删除表白墙
     *
     * @param confessionWall
     * @return
     */
    @Transactional
    public int deleteOne(ConfessionWall confessionWall) {
        Image image = new Image();
        image.setType(ModelType.MODEL_CONFESSIONWALL);
        image.setTypeId(confessionWall.getId());
        Image selectImage = imageMapper.selectOne(image);
        imageMapper.deleteOne(image);
        if (selectImage != null && selectImage.getSrc() != null) {
            File file = new File(selectImage.getSrc());
            file.delete();
        }
        return confessionWallMapper.deleteOne(confessionWall);
    }

    /**
     * 查表白墙
     *
     * @return
     */
    @Transactional
    public List<Map> selectLimit(String stuNum, int id) {
        List<Map> result = new ArrayList<>();
        List<ConfessionWall> selectConfession = confessionWallMapper.selectLimit(id);
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
            Image selectImage = imageMapper.selectOne(image);
            if (selectImage != null) {
                map.put("imageDivideNumber", ImageUtil.getHeightDivideWidth(selectImage.getSrc()));
            }
            map.put("image", selectImage);
            Great great = new Great();
            great.setStuNum(stuNum);
            great.setType(ModelType.MODEL_CONFESSIONWALL);
            great.setTypeId(wallItem.getId());
            Great selectGreat = greatMapper.selectOne(great);
            if (selectGreat != null) {
                map.put("clickGreat", true);
            }
            map.put("greatCount", greatMapper.selectCount(great));
            Comment comment = new Comment();
            comment.setType(ModelType.MODEL_CONFESSIONWALL);
            comment.setTypeId(wallItem.getId());
            map.put("commentCount", commentMapper.selectCount(comment));
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
    public List<Map> selectMyLimit(String stuNum, int id) {
        List<Map> result = new ArrayList<>();
        List<ConfessionWall> selectConfession = confessionWallMapper.selectMyLimit(stuNum, id);
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
            Image selectImage = imageMapper.selectOne(image);
            if (selectImage != null) {
                map.put("imageDivideNumber", ImageUtil.getHeightDivideWidth(selectImage.getSrc()));
            }
            map.put("image", imageMapper.selectOne(image));
            Great great = new Great();
            great.setStuNum(stuNum);
            great.setType(ModelType.MODEL_CONFESSIONWALL);
            great.setTypeId(wallItem.getId());
            Great selectGreat = greatMapper.selectOne(great);
            if (selectGreat != null) {
                map.put("clickGreat", true);
            }
            map.put("greatCount", greatMapper.selectCount(great));
            Comment comment = new Comment();
            comment.setType(ModelType.MODEL_CONFESSIONWALL);
            comment.setTypeId(wallItem.getId());
            map.put("commentCount", commentMapper.selectCount(comment));
            result.add(map);
        }
        return result;
    }

}
