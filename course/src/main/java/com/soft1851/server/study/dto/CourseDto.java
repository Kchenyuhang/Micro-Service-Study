package com.soft1851.server.study.dto;

import com.soft1851.server.study.entity.Course;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/9/16
 */
public class CourseDto {
    private String userName;
    private String userAvatar;
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    @Override
    public String toString() {
        return "CourseDto{" +
                "userName='" + userName + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                ", course=" + course +
                '}';
    }
}
