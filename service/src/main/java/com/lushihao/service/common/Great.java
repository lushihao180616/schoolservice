package com.lushihao.service.common;

/**
 * 点赞
 */
public class Great {

    /**
     * 自增主键
     */
    private int id;
    /**
     * 类型
     */
    private String type;
    /**
     * 类型的主键
     */
    private int typeId;
    /**
     * 点赞人
     */
    private String stuNum;
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

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
