package com.lushihao.service.service;

import com.lushihao.service.bean.Lost;
import com.lushihao.service.bean.User;
import com.lushihao.service.dao.LostMapper;
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
public class LostService {

    @Resource
    private LostMapper lostMapper;
    @Resource
    private UserMapper userMapper;

    @Transactional
    public int insertOne(Lost lost) {
        return lostMapper.insertOne(lost);
    }

    @Transactional
    public int deleteOne(Lost lost) {
        return lostMapper.deleteOne(lost);
    }

    @Transactional
    public List<Map> selectLimit() {
        List<Map> result = new ArrayList<>();
        List<Lost> selectPlay = lostMapper.selectLimit();
        for (Lost lostItem : selectPlay) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(lostItem);
            if (StringUtils.isNotEmpty(lostItem.getStuNum())) {
                User user = new User();
                user.setStuNum(lostItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            result.add(map);
        }
        return result;
    }

}
