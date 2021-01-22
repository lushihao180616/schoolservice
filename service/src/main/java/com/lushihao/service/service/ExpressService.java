package com.lushihao.service.service;

import com.lushihao.service.bean.Express;
import com.lushihao.service.bean.User;
import com.lushihao.service.dao.ExpressMapper;
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
public class ExpressService {

    @Resource
    private ExpressMapper expressMapper;
    @Resource
    private UserMapper userMapper;

    @Transactional
    public int insertOne(Express express) {
        return expressMapper.insertOne(express);
    }

    @Transactional
    public int deleteOne(Express express) {
        return expressMapper.deleteOne(express);
    }

    @Transactional
    public List<Map> selectMyLimit(Express express) {
        List<Map> result = new ArrayList<>();
        List<Express> selectExpress = expressMapper.selectMyLimit(express);
        for (Express expressItem : selectExpress) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(expressItem);
            if (StringUtils.isNotEmpty(expressItem.getStuNum())) {
                User user = new User();
                user.setStuNum(expressItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            result.add(map);
        }
        return result;
    }

}
