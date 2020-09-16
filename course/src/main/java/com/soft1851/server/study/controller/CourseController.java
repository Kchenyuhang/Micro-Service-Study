package com.soft1851.server.study.controller;

import com.netflix.discovery.converters.Auto;
import com.soft1851.server.study.dao.CourseDao;
import com.soft1851.server.study.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述:
 *
 * @author：Guorc
 * @create 2020-09-16 10:22
 */
@RestController
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    private CourseDao courseDao;

    @GetMapping("/findById")
    public List<Course> getInfo(@RequestParam("userId") Integer userId){
        return courseDao.getInfo(userId);
    }
}
