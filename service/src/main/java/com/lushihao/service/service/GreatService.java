package com.lushihao.service.service;

import com.lushihao.service.bean.User;
import com.lushihao.service.common.Great;
import com.lushihao.service.dao.GreatMapper;
import com.lushihao.service.dao.UserMapper;
import com.lushihao.service.util.BeanMapUtil;
import com.lushihao.service.util.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GreatService {

    @Resource
    private GreatMapper greatMapper;
    @Resource
    private UserMapper userMapper;

    /**
     * 添加点赞
     *
     * @param greatList
     * @return
     */
    @Transactional
    public void insertAll(List<Great> greatList) {
        for (Great great : greatList) {
            great.setCreateTime(DateUtil.nowyMdHms());
            Great selectGreat = greatMapper.selectOne(great);
            if (selectGreat != null) {
                greatMapper.deleteOne(selectGreat);
            } else {
                greatMapper.insertOne(great);
            }
        }
    }

    /**
     * 查我点赞的
     *
     * @return
     */
    @Transactional
    public List<Map> selectMyLimit(Great great) {
        List<Map> result = new ArrayList<>();
        List<Great> selectGreat = greatMapper.selectMyLimit(great);
        for (Great greatItem : selectGreat) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(greatItem);
            if (StringUtils.isNotEmpty(greatItem.getStuNum())) {
                User user = new User();
                user.setStuNum(greatItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            result.add(map);
        }
        return result;
    }

}
