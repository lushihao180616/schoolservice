package com.lushihao.service.activity;

/**
 * 视频
 */
public class ActivityVideo {

    /**
     * 自增主键
     */
    private int id;
    /**
     * 视频地址
     */
    private String src;
    /**
     * 类型（00：最美）
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

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

}
