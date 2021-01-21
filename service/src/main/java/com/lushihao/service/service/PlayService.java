package com.lushihao.service.service;

import com.lushihao.service.bean.Play;
import com.lushihao.service.bean.User;
import com.lushihao.service.common.Audio;
import com.lushihao.service.common.Image;
import com.lushihao.service.common.ModelType;
import com.lushihao.service.common.PlayGameType;
import com.lushihao.service.dao.AudioMapper;
import com.lushihao.service.dao.PlayMapper;
import com.lushihao.service.dao.UserMapper;
import com.lushihao.service.util.BeanMapUtil;
import com.lushihao.service.util.ImageUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PlayService {

    @Resource
    private PlayMapper playMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private AudioMapper audioMapper;

    /**
     * 创建一条约玩
     *
     * @param play
     * @return
     */
    @Transactional
    public int insertOne(Play play) {
        return playMapper.insertOne(play);
    }

    /**
     * 删除一条约玩
     *
     * @param play
     * @return
     */
    @Transactional
    public int deleteOne(Play play) {
        return playMapper.deleteOne(play);
    }

    /**
     * 分页查询约玩
     *
     * @return
     */
    @Transactional
    public List<Map> selectLimit() {
        List<Map> result = new ArrayList<>();
        List<Play> selectPlay = playMapper.selectLimit();
        for (Play playItem : selectPlay) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(playItem);
            if (StringUtils.isNotEmpty(playItem.getStuNum())) {
                User user = new User();
                user.setStuNum(playItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            Audio audio = new Audio();
            audio.setType(ModelType.MODEL_PLAY);
            audio.setTypeId(playItem.getId());
            Audio selectAudio = audioMapper.selectOne(audio);
            map.put("audio", selectAudio);
            map.put("game", PlayGameType.gameType.get(playItem.getType()));
            result.add(map);
        }
        return result;
    }

    /**
     * 分页查询约玩
     *
     * @return
     */
    @Transactional
    public List<Map> selectMyLimit(Play play) {
        List<Map> result = new ArrayList<>();
        List<Play> selectPlay = playMapper.selectMyLimit(play);
        for (Play playItem : selectPlay) {
            Map<String, Object> map = (Map<String, Object>) BeanMapUtil.beanToMap(playItem);
            if (StringUtils.isNotEmpty(playItem.getStuNum())) {
                User user = new User();
                user.setStuNum(playItem.getStuNum());
                map.put("user", userMapper.selectOne(user));
            }
            Audio audio = new Audio();
            audio.setType(ModelType.MODEL_PLAY);
            audio.setTypeId(playItem.getId());
            Audio selectAudio = audioMapper.selectOne(audio);
            map.put("audio", selectAudio);
            map.put("game", PlayGameType.gameType.get(playItem.getType()));
            result.add(map);
        }
        return result;
    }

}
