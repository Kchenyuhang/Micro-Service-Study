package com.soft1851.server.study.mapper;

import com.soft1851.server.study.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/9/16
 */
@Mapper
@Component(value = "userMapper")
public interface UserMapper {

    @Select(value = "SELECT * FROM t_user ")
    List<User> selectAll();

    @Select(value = "SELECT * FROM t_user WHERE id = #{userId}")
    User selectByUserId(Integer userId);
}
