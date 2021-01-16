package com.lushihao.service.service;

import com.lushihao.service.activity.*;
import com.lushihao.service.bean.User;
import com.lushihao.service.dao.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ActivityBeautifulGreatService {

    @Resource
    private ActivityBeautifulGreatMapper activityBeautifulGreatMapper;
    @Resource
    private UserMapper userMapper;

    @Transactional
    public int insertOne(ActivityBeautifulGreat activityBeautifulGreat) {
        return activityBeautifulGreatMapper.insertOne(activityBeautifulGreat);
    }

    @Transactional
    public int deleteOne(ActivityBeautifulGreat activityBeautifulGreat) {
        return activityBeautifulGreatMapper.deleteOne(activityBeautifulGreat);
    }

    @Transactional
    public List<Map> selectMy(ActivityBeautifulGreat activityBeautifulGreat) {
        List<Map> result = new ArrayList<>();
        List<ActivityBeautifulGreat> greatList = activityBeautifulGreatMapper.selectMy(activityBeautifulGreat);

        User user = new User();
        user.setStuNum(activityBeautifulGreat.getFromStuNum());
        User selectUserFrom = userMapper.selectOne(user);
        for (ActivityBeautifulGreat great : greatList) {
            Map<String, Object> map = new HashMap<>();

            user = new User();
            user.setStuNum(great.getStuNum());
            User selectUserTo = userMapper.selectOne(user);

            map.put("user", selectUserTo);
            map.put("fromUser", selectUserFrom);
            result.add(map);
        }
        return result;
    }
}
