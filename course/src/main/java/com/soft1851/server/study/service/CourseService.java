package com.soft1851.server.study.service;

import com.soft1851.server.study.dto.CourseDto;

import java.util.List;

/**
 * @author Guorc
 */
public interface CourseService {
    List<CourseDto> findCourse();
    CourseDto findCourseById(Integer id);
}
