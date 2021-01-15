package com.lushihao.service.common;

/**
 * 图片
 */
public class Image {

    /**
     * 自增主键
     */
    private int id;
    /**
     * 地址
     */
    private String src;
    /**
     * 图片类型(00:表白墙，01:跳蚤市场)
     */
    private String type;
    /**
     * 图片对应的类型id
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
