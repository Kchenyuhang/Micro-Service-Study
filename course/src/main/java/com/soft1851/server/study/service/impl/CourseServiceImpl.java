package com.soft1851.server.study.service.impl;

import com.soft1851.server.study.dao.CourseDao;
import com.soft1851.server.study.dto.CourseDto;
import com.soft1851.server.study.dto.UserDto;
import com.soft1851.server.study.entity.Course;
import com.soft1851.server.study.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author：Guorc
 * @create 2020-09-16 14:28
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private CourseDao courseDao;

    @Override
    public List<CourseDto> findCourse() {
        List<Course> course = courseDao.getInfo();
        List<CourseDto> courseDtoList = new ArrayList<>();
        CourseDto courseDto;
        for (Course c:course
             ) {
            courseDto = new CourseDto();
            Course course1 = courseDao.findCourseById(c.getId());
            Integer userId = course1.getUserId();
            UserDto userDto = restTemplate.getForObject("http://47.115.60.46:8082/user/id?userId="+userId,UserDto.class,userId);
            System.out.println(course1);
            courseDto.setCourse(course1);
            System.out.println(courseDto.getCourse());
            courseDto.setUserName(userDto.getName());
            courseDto.setUserAvatar(userDto.getAvatar());
            courseDtoList.add(courseDto);
        }
        return courseDtoList;
    }

    @Override
    public CourseDto findCourseById(Integer id) {
        Course course = courseDao.findCourseById(id);
        Integer userId = course.getUserId();
        UserDto userDto = restTemplate.getForObject("http://47.115.60.46:8082/user/id?userId="+userId,UserDto.class,userId);
        CourseDto courseDto = new CourseDto();
        courseDto.setCourse(course);
        courseDto.setUserName(userDto.getName());
        courseDto.setUserAvatar(userDto.getAvatar());
        return courseDto;
    }
}
