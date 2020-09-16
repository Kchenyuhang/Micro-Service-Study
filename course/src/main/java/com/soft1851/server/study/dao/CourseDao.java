package com.soft1851.server.study.dao;

import com.soft1851.server.study.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 描述:
 *
 * @author：Guorc
 * @create 2020-09-16 10:04
 */
@Mapper
@Component(value = "courseDao")
public interface CourseDao {
    @Select("SELECT id,name,cover,class_name,user_id,is_enabled from t_course")
    List<Course> getInfo();

    @Select("SELECT id,name,cover,class_name,user_id,is_enabled from t_course where id = #{id}")
    Course findCourseById(Integer id);
}
