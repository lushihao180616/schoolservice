package com.lushihao.service.activity;

import java.util.List;

/**
 * 活动评选-最美
 */
public class ActivityBeautiful {

    /**
     * 自增主键
     */
    private int id;
    /**
     * 学号
     */
    private String stuNum;
    /**
     * 图片（9张）
     */
    private List<ActivityImage> activityImageList;
    /**
     * 视频
     */
    private ActivityVideo activityVideo;
    /**
     * 录音
     */
    private ActivityAudio activityAudio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public List<ActivityImage> getActivityImageList() {
        return activityImageList;
    }

    public void setActivityImageList(List<ActivityImage> activityImageList) {
        this.activityImageList = activityImageList;
    }

    public ActivityVideo getActivityVideo() {
        return activityVideo;
    }

    public void setActivityVideo(ActivityVideo activityVideo) {
        this.activityVideo = activityVideo;
    }

    public ActivityAudio getActivityAudio() {
        return activityAudio;
    }

    public void setActivityAudio(ActivityAudio activityAudio) {
        this.activityAudio = activityAudio;
    }

}
