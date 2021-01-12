package com.lushihao.service.activity;

/**
 * 音频
 */
public class ActivityAudio {

    /**
     * 自增主键
     */
    private int id;
    /**
     * 图片地址
     */
    private String url;
    /**
     * 类型（活动-最美：0）
     */
    private String type;
    /**
     * 类型的主键
     */
    private String typeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

}
