package com.briup.apps.app02.service;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.extend.CourseExtend;

import java.util.List;

public interface ICourseService {
    List<Course> findAll();
    Course findCourseById(Long id);
   void insertOrUpdate(Course course)throws Exception;
    void deleteCourseById(Long id) throws Exception;
    List<Course> query(Course course);

    List<CourseExtend> selectAllWithTeacher();
}
