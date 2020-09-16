package com.soft1851.server.study.service.impl;

import com.soft1851.server.study.entity.User;
import com.soft1851.server.study.mapper.UserMapper;
import com.soft1851.server.study.service.UserService;
import com.soft1851.server.study.vo.UserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/9/16
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserVo> selectAll() {
        List<User> userList = userMapper.selectAll();
        List<UserVo> list = new ArrayList<>();
        userList.forEach(user -> {
            UserVo result = UserVo.fromUser(user);
            list.add(result);
        });
        return list;
    }

    @Override
    public UserVo selectByUserId(Integer userId) {
        User user = userMapper.selectByUserId(userId);
        return UserVo.fromUser(user);
    }
}
