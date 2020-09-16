package com.soft1851.server.study.dao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
class CourseDaoTest {
    @Autowired
    private CourseDao courseDao;
    @Test
    void findCourseById() {
        System.out.println(courseDao.findCourseById(1));
    }

    @Test
    void getInfo() {
    }
}