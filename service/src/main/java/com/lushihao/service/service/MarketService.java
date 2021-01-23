package com.lushihao.service.service;

import com.lushihao.service.bean.Market;
import com.lushihao.service.bean.User;
import com.lushihao.service.common.Image;
import com.lushihao.service.common.ModelType;
import com.lushihao.service.dao.ImageMapper;
import com.lushihao.service.dao.MarketMapper;
import com.lushihao.service.dao.UserMapper;
import com.lushihao.service.util.BeanMapUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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

    @Transactional
    public int insertOne(Market market) {
        return marketMapper.insertOne(market);
    }

    @Transactional
    public int deleteOne(Market market) {
        return marketMapper.deleteOne(market);
    }

    @Transactional
    public List<Map> selectLimit() {
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
