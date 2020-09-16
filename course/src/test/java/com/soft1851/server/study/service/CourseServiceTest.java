package com.soft1851.server.study.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
class CourseServiceTest {
    @Autowired
    private CourseService courseService;
    @Test
    void findCourseById() {
        System.out.println(courseService.findCourseById(1));
    }
    @Test
    void findList(){
        System.out.println(courseService.findCourse());
    }
}