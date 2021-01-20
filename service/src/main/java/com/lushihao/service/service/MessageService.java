package com.lushihao.service.service;

import com.lushihao.service.common.Message;
import com.lushihao.service.bean.User;
import com.lushihao.service.common.ModelType;
import com.lushihao.service.dao.MessageMapper;
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
public class MessageService {

    @Resource
    private MessageMapper messageMapper;
    @Resource
    private UserMapper userMapper;

    /**
     * 分页查询消息
     *
     * @return
     */
    @Transactional
    public List<Map> selectMyLimit(Message message) {
        List<Map> result = new ArrayList<>();
        List<Message> selectMessage = messageMapper.selectMyLimit(message);
        for (Message messageItem : selectMessage) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(messageItem);
            if (StringUtils.isNotEmpty(messageItem.getStuNum())) {
                User user = new User();
                user.setStuNum(messageItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            map.put("name", ModelType.modelType.get(messageItem.getType()));
            result.add(map);
        }
        return result;
    }
}
