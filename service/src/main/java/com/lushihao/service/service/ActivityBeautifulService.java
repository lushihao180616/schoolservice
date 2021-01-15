package com.lushihao.service.service;

import com.lushihao.service.activity.ActivityAudio;
import com.lushihao.service.activity.ActivityBeautiful;
import com.lushihao.service.activity.ActivityImage;
import com.lushihao.service.activity.ActivityVideo;
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
public class ActivityBeautifulService {

    @Resource
    private ActivityBeautifulMapper activityBeautifulMapper;
    @Resource
    private ActivityImageMapper activityImageMapper;
    @Resource
    private ActivityVideoMapper activityVideoMapper;
    @Resource
    private ActivityAudioMapper activityAudioMapper;
    @Resource
    private UserMapper userMapper;

    @Transactional
    public int insertOne(ActivityBeautiful activityBeautiful) {
        return 0;
    }

    @Transactional
    public int deleteOne(ActivityBeautiful activityBeautiful) {
        return 0;
    }

    @Transactional
    public List<Map> selectLimit() {
        List<Map> result = new ArrayList<>();
        List<ActivityBeautiful> activityBeautifulList = activityBeautifulMapper.selectLimit();
        for (ActivityBeautiful beautiful : activityBeautifulList) {
            Map<String, Object> map = new HashMap<>();

            User user = new User();
            user.setStuNum(beautiful.getStuNum());
            User selectUser = userMapper.selectOne(user);

            //关联的音频
            ActivityAudio activityAudio = new ActivityAudio();
            activityAudio.setType("00");
            activityAudio.setTypeId(beautiful.getId());
            List<ActivityAudio> activityAudioList = activityAudioMapper.selectMy(activityAudio);

            //关联的视频
            ActivityVideo activityVideo = new ActivityVideo();
            activityVideo.setType("00");
            activityVideo.setTypeId(beautiful.getId());
            List<ActivityVideo> activityVideoList = activityVideoMapper.selectMy(activityVideo);

            //关联的图片
            ActivityImage activityImage = new ActivityImage();
            activityImage.setType("00");
            activityImage.setTypeId(beautiful.getId());
            List<ActivityImage> activityImageList = activityImageMapper.selectMy(activityImage);

            map.put("user", selectUser);
            map.put("audioList", activityAudioList);
            map.put("videoList", activityVideoList);
            map.put("imageList", activityImageList);
            result.add(map);
        }
        return result;
    }
}
