package com.lushihao.service.service;

import com.lushihao.service.bean.Market;
import com.lushihao.service.bean.User;
import com.lushihao.service.common.Comment;
import com.lushihao.service.common.Great;
import com.lushihao.service.common.Image;
import com.lushihao.service.common.ModelType;
import com.lushihao.service.dao.*;
import com.lushihao.service.util.BeanMapUtil;
import com.lushihao.service.util.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MarketService {

    @Resource
    private MarketMapper marketMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private ImageMapper imageMapper;
    @Resource
    private GreatMapper greatMapper;
    @Resource
    private CommentMapper commentMapper;

    @Transactional
    public int insertOne(Market market) {
        market.setCreateTime(DateUtil.nowyMdHms());
        if (marketMapper.insertOne(market) > 0) {
            return market.getId();
        }
        return 0;
    }

    @Transactional
    public int deleteOne(Market market) {
        Image image = new Image();
        image.setType(ModelType.MODEL_MARKET);
        image.setTypeId(market.getId());
        Image selectImage = imageMapper.selectOne(image);
        imageMapper.deleteOne(image);
        if (selectImage != null && selectImage.getSrc() != null) {
            File file = new File(selectImage.getSrc());
            file.delete();
        }
        return marketMapper.deleteOne(market);
    }

    @Transactional
    public List<Map> selectLimit(String stuNum) {
        List<Map> result = new ArrayList<>();
        List<Market> selectConfession = marketMapper.selectLimit();
        for (Market marketItem : selectConfession) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(marketItem);
            if (StringUtils.isNotEmpty(marketItem.getStuNum())) {
                User user = new User();
                user.setStuNum(marketItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            Image image = new Image();
            image.setType(ModelType.MODEL_MARKET);
            image.setTypeId(marketItem.getId());
            map.put("image", imageMapper.selectOne(image));
            Great great = new Great();
            great.setStuNum(stuNum);
            great.setType(ModelType.MODEL_MARKET);
            great.setTypeId(marketItem.getId());
            Great selectGreat = greatMapper.selectOne(great);
            if (selectGreat != null) {
                map.put("clickGreat", true);
            }
            map.put("greatCount", greatMapper.selectCount(great));
            Comment comment = new Comment();
            comment.setType(ModelType.MODEL_MARKET);
            comment.setTypeId(marketItem.getId());
            map.put("commentCount", commentMapper.selectCount(comment));
            result.add(map);
        }
        return result;
    }

    @Transactional
    public List<Map> selectMyLimit(Market market) {
        List<Map> result = new ArrayList<>();
        List<Market> selectConfession = marketMapper.selectMyLimit(market);
        for (Market marketItem : selectConfession) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(marketItem);
            if (StringUtils.isNotEmpty(marketItem.getStuNum())) {
                User user = new User();
                user.setStuNum(marketItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            Image image = new Image();
            image.setType(ModelType.MODEL_MARKET);
            image.setTypeId(marketItem.getId());
            map.put("image", imageMapper.selectOne(image));
            result.add(map);
        }
        return result;
    }

}
