package com.lushihao.service.service;

import com.lushihao.service.bean.Play;
import com.lushihao.service.bean.User;
import com.lushihao.service.common.*;
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
public class PlayService {

    @Resource
    private PlayMapper playMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private AudioMapper audioMapper;
    @Resource
    private GreatMapper greatMapper;
    @Resource
    private CommentMapper commentMapper;

    /**
     * 创建一条约玩
     *
     * @param play
     * @return
     */
    @Transactional
    public int insertOne(Play play) {
        play.setCreateTime(DateUtil.nowyMdHms());
        if (playMapper.insertOne(play) > 0) {
            return play.getId();
        }
        return 0;
    }

    /**
     * 删除一条约玩
     *
     * @param play
     * @return
     */
    @Transactional
    public int deleteOne(Play play) {
        Audio audio = new Audio();
        audio.setType(ModelType.MODEL_PLAY);
        audio.setTypeId(play.getId());
        Audio selectAudio = audioMapper.selectOne(audio);
        audioMapper.deleteOne(audio);
        if (selectAudio != null && selectAudio.getSrc() != null) {
            File file = new File(selectAudio.getSrc());
            file.delete();
        }
        return playMapper.deleteOne(play);
    }

    /**
     * 分页查询约玩
     *
     * @return
     */
    @Transactional
    public List<Map> selectLimit(String stuNum, int id) {
        List<Map> result = new ArrayList<>();
        List<Play> selectPlay = playMapper.selectLimit(id);
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
            Great great = new Great();
            great.setStuNum(stuNum);
            great.setType(ModelType.MODEL_PLAY);
            great.setTypeId(playItem.getId());
            Great selectGreat = greatMapper.selectOne(great);
            if (selectGreat != null) {
                map.put("clickGreat", true);
            }
            map.put("greatCount", greatMapper.selectCount(great));
            Comment comment = new Comment();
            comment.setType(ModelType.MODEL_PLAY);
            comment.setTypeId(playItem.getId());
            map.put("commentCount", commentMapper.selectCount(comment));
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
    public List<Map> selectMyLimit(String stuNum, int id) {
        List<Map> result = new ArrayList<>();
        List<Play> selectPlay = playMapper.selectMyLimit(stuNum, id);
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
            Great great = new Great();
            great.setStuNum(stuNum);
            great.setType(ModelType.MODEL_PLAY);
            great.setTypeId(playItem.getId());
            Great selectGreat = greatMapper.selectOne(great);
            if (selectGreat != null) {
                map.put("clickGreat", true);
            }
            map.put("greatCount", greatMapper.selectCount(great));
            Comment comment = new Comment();
            comment.setType(ModelType.MODEL_PLAY);
            comment.setTypeId(playItem.getId());
            map.put("commentCount", commentMapper.selectCount(comment));
            result.add(map);
        }
        return result;
    }

}
