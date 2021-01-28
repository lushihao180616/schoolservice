package com.lushihao.service.common;

public class Dormitory {

    /**
     * 自增主键
     */
    private int id;
    /**
     * 名称
     */
    private String name;
    /**
     * 宿舍类型（0:男生宿舍  1:女生宿舍）
     */
    private int sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
