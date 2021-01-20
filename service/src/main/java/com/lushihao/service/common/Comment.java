package com.lushihao.service.common;

/**
 * 评论
 */
public class Comment {

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
     * 评论人
     */
    private String stuNum;
    /**
     * 评论内容
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
