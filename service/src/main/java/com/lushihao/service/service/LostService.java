package com.lushihao.service.service;

import com.lushihao.service.bean.Lost;
import com.lushihao.service.bean.User;
import com.lushihao.service.common.Comment;
import com.lushihao.service.common.Great;
import com.lushihao.service.common.ModelType;
import com.lushihao.service.dao.CommentMapper;
import com.lushihao.service.dao.GreatMapper;
import com.lushihao.service.dao.LostMapper;
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
public class LostService {

    @Resource
    private LostMapper lostMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private GreatMapper greatMapper;
    @Resource
    private CommentMapper commentMapper;

    @Transactional
    public int insertOne(Lost lost) {
        lost.setCreateTime(DateUtil.nowyMdHms());
        if (lostMapper.insertOne(lost) > 0) {
            return lost.getId();
        }
        return 0;
    }

    @Transactional
    public int deleteOne(Lost lost) {
        return lostMapper.deleteOne(lost);
    }

    @Transactional
    public List<Map> selectLimit(String stuNum, int id) {
        List<Map> result = new ArrayList<>();
        List<Lost> selectPlay = lostMapper.selectLimit(id);
        for (Lost lostItem : selectPlay) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(lostItem);
            if (StringUtils.isNotEmpty(lostItem.getStuNum())) {
                User user = new User();
                user.setStuNum(lostItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            Great great = new Great();
            great.setStuNum(stuNum);
            great.setType(ModelType.MODEL_LOST);
            great.setTypeId(lostItem.getId());
            Great selectGreat = greatMapper.selectOne(great);
            if (selectGreat != null) {
                map.put("clickGreat", true);
            }
            map.put("greatCount", greatMapper.selectCount(great));
            Comment comment = new Comment();
            comment.setType(ModelType.MODEL_LOST);
            comment.setTypeId(lostItem.getId());
            map.put("commentCount", commentMapper.selectCount(comment));
            result.add(map);
        }
        return result;
    }

    @Transactional
    public List<Map> selectMyLimit(Lost lost) {
        List<Map> result = new ArrayList<>();
        List<Lost> selectPlay = lostMapper.selectMyLimit(lost);
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
