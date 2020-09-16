package com.soft1851.server.study.vo;

import com.soft1851.server.study.entity.User;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/9/16
 */
public class UserVo {

    private Integer id;

    private String nickname;

    private String avatar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public static UserVo fromUser(User user) {
        UserVo result = new UserVo();
        result.setId(user.getId());
        result.setNickname(user.getNickname());
        result.setAvatar(user.getAvatar());
        return result;
    }
}
