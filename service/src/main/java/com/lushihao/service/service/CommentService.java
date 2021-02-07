package com.lushihao.service.service;

import com.lushihao.service.bean.User;
import com.lushihao.service.common.Comment;
import com.lushihao.service.dao.CommentMapper;
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
public class CommentService {

    @Resource
    private CommentMapper commentMapper;
    @Resource
    private UserMapper userMapper;

    /**
     * 添加评论
     *
     * @param comment
     * @return
     */
    @Transactional
    public List<Map> insertOne(Comment comment) {
        comment.setCreateTime(DateUtil.nowyMdHms());
        if(commentMapper.insertOne(comment) > 0){
            return selectTypeLimit(comment);
        }
        return null;
    }

    /**
     * 删除评论
     *
     * @param comment
     * @return
     */
    @Transactional
    public int deleteOne(Comment comment) {
        return commentMapper.deleteOne(comment);
    }

    /**
     * 查我评论的
     *
     * @return
     */
    @Transactional
    public List<Map> selectMyLimit(Comment comment) {
        List<Map> result = new ArrayList<>();
        List<Comment> selectComment = commentMapper.selectMyLimit(comment);
        for (Comment commentItem : selectComment) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(commentItem);
            if (StringUtils.isNotEmpty(commentItem.getStuNum())) {
                User user = new User();
                user.setStuNum(commentItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            result.add(map);
        }
        return result;
    }

    /**
     * 查某条的评论
     *
     * @param comment
     * @return
     */
    @Transactional
    public List<Map> selectTypeLimit(Comment comment) {
        List<Map> result = new ArrayList<>();
        List<Comment> selectComment = commentMapper.selectTypeLimit(comment);
        for (Comment commentItem : selectComment) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(commentItem);
            if (StringUtils.isNotEmpty(commentItem.getStuNum())) {
                User user = new User();
                user.setStuNum(commentItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            result.add(map);
        }
        return result;
    }

}
