package com.briup.apps.app02.dao;

import com.briup.apps.app02.bean.Course;

import java.util.List;

public interface CourseMapper {
    List<Course> findAll();
    Course findCourseById(Long id);
    void updateCourse(Course course);
    void insertCourse(Course course);
    void deleteCourseById(Long id);
    List<Course> query(Course course);
}
