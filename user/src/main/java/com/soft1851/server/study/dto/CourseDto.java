package com.soft1851.server.study.dto;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/9/16
 */
public class CourseDto {
    private String courseName;
    private String courseAvatar;
    private String className;
    private String userName;
    private String userAvatar;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAvatar() {
        return courseAvatar;
    }

    public void setCourseAvatar(String courseAvatar) {
        this.courseAvatar = courseAvatar;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
                "courseName='" + courseName + '\'' +
                ", courseAvatar='" + courseAvatar + '\'' +
                ", className='" + className + '\'' +
                ", userName='" + userName + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                '}';
    }
}
