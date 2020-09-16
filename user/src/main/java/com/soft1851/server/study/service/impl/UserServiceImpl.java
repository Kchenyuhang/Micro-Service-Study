package com.soft1851.server.study.service.impl;

import com.soft1851.server.study.dto.UserDto;
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
    public List<UserDto> selectAll() {
        List<User> userList = userMapper.selectAll();
        List<UserDto> list = new ArrayList<>();
        userList.forEach(user -> {
            UserVo result = UserVo.fromUser(user);
            UserDto userDto = new UserDto();
            userDto.setAvatar(result.getAvatar());
            userDto.setName(result.getNickname());
            userDto.setId(result.getId());
            list.add(userDto);
        });
        return list;
    }

    @Override
    public UserDto selectByUserId(Integer userId) {
        User user = userMapper.selectByUserId(userId);
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getNickname());
        userDto.setAvatar(user.getAvatar());
        return userDto;
    }
}
