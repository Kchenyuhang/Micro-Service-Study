package com.soft1851.server.study.service;

import com.soft1851.server.study.entity.User;
import com.soft1851.server.study.vo.UserVo;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/9/16
 */
public interface UserService {

    /**
     * 查询所有
     *
     * @return
     */
    List<UserVo> selectAll();

    /**
     * 根据id查询
     *
     * @return
     */
    UserVo selectByUserId(Integer userId);
}
