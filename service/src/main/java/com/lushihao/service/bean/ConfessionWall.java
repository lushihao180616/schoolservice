package com.lushihao.service.bean;

/**
 * 告白墙
 */
public class ConfessionWall {

    /**
     * 自增主键
     */
    private int id;
    /**
     * 学号
     */
    private String stuNum;
    /**
     * 标题
     */
    private String title;
    /**
     * 详情
     */
    private String content;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
