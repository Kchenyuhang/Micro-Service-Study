package com.soft1851.server.study.controller;

import com.soft1851.server.study.dto.UserDto;
import com.soft1851.server.study.entity.User;
import com.soft1851.server.study.service.UserService;
import com.soft1851.server.study.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/9/16
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/all")
    public List<UserDto> getAll() {
        return userService.selectAll();
    }

    @GetMapping(value = "/id")
    public UserDto getById(@RequestParam("userId") Integer userId) {
        return userService.selectByUserId(userId);
    }
}
