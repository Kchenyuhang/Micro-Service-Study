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
        CourseDto courseDto = new CourseDto();
        for (Course c:course
             ) {
            Course course1 = courseDao.findCourseById(c.getId());
            Integer userId = course1.getUserId();
            UserDto userDto = restTemplate.getForObject("http://10.40.181.73:8082/user/id?userId="+userId,UserDto.class,userId);
            courseDto.setCourse(course1);
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
        UserDto userDto = restTemplate.getForObject("http://10.40.181.73:8082/user/id?userId="+userId,UserDto.class,userId);
        CourseDto courseDto = new CourseDto();
        courseDto.setCourse(course);
        courseDto.setUserName(userDto.getName());
        courseDto.setUserAvatar(userDto.getAvatar());
        return courseDto;
    }
}
