package com.soft1851.server.study.controller;



import com.soft1851.server.study.dto.CourseDto;

import com.soft1851.server.study.service.CourseService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
    @Resource
    private CourseService courseService;

    @GetMapping("/list")
    public List<CourseDto> getInfo(){
        return courseService.findCourse();
    }

    @GetMapping("/courseId")
    public CourseDto getCourseOne(@RequestParam("id") Integer id){
        return courseService.findCourseById(id);
    }
}
