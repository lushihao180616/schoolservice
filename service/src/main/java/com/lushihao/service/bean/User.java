package com.lushihao.service.bean;

/**
 * 用户
 */
public class User {

    /**
     * 学号
     */
    private String stuNum;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 年级
     */
    private String grade;
    /**
     * 班级
     */
    private String className;
    /**
     * 专业
     */
    private String major;
    /**
     * 性别（0：男   1：女）
     */
    private int sex;
    /**
     * 旧密码
     */
    private String oldPwd;
    /**
     * 管理员标识（0：学生  1：导师  2：超级管理员）
     */
    private String manageFlag;

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getOldPwd() {
        return oldPwd;
    }

    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
    }

    public String getManageFlag() {
        return manageFlag;
    }

    public void setManageFlag(String manageFlag) {
        this.manageFlag = manageFlag;
    }
}
