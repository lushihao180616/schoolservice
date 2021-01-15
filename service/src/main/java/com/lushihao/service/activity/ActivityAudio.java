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
     * 音频地址
     */
    private String src;
    /**
     * 类型（00：最美）
     */
    private String type;
    /**
     * 类型的主键
     */
    private int typeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
