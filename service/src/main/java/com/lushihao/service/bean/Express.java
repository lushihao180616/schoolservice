package com.lushihao.service.bean;

/**
 * 快递
 */
public class Express {

    /**
     * 自增主键
     */
    private int id;
    /**
     * 学号
     */
    private String stuNum;
    /**
     * 地点
     */
    private String place;
    /**
     * 数量
     */
    private int count;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
