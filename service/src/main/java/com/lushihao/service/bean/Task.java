package com.lushihao.service.bean;

/**
 * 任务
 */
public class Task {
    /**
     * 自增主键
     */
    private int id;
    /**
     * 标题
     */
    private String title;
    /**
     * 详情
     */
    private String content;
    /**
     * 学号
     */
    private String stuNum;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 结束时间
     */
    private String endTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
