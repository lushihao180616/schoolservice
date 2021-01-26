package com.lushihao.service.bean;

import com.lushihao.service.common.Audio;

/**
 * 约玩
 */
public class Play {
    /**
     * 自增主键
     */
    private int id;
    /**
     * 学号
     */
    private String stuNum;
    /**
     * 详情
     */
    private String content;
    /**
     * 音频
     */
    private Audio audio;
    /**
     * 游戏
     */
    private String type;
    /**
     * 创建时间
     */
    private String createTime;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
