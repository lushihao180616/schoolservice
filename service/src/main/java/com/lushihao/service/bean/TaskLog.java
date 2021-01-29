package com.lushihao.service.bean;

/**
 * 任务日志
 */
public class TaskLog {
    /**
     * 自增主键
     */
    private int id;
    /**
     * 任务主键
     */
    private int taskId;
    /**
     * 接单人
     */
    private String stuNum;
    /**
     * 接单时间
     */
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
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
