package com.soft1851.server.study.entity;

import lombok.*;

/**
 * 描述:
 *
 * @author：Guorc
 * @create 2020-09-16 10:01
 */
@Data
public class Course {
    private Integer id;
    private String name;
    private String cover;
    private String className;
    private Integer userId;
    private Integer isEnabled;

    public Course(Integer id, String name, String cover, String className, Integer userId, Integer isEnabled) {
        this.id = id;
        this.name = name;
        this.cover = cover;
        this.className = className;
        this.userId = userId;
        this.isEnabled = isEnabled;
    }

    public Course() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cover='" + cover + '\'' +
                ", className='" + className + '\'' +
                ", userId=" + userId +
                ", isEnabled=" + isEnabled +
                '}';
    }
}
