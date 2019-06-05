package com.briup.apps.app02.web.controller;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.extend.CourseExtend;
import com.briup.apps.app02.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @GetMapping("findAll")
    public List<Course> findAll() {

        return courseService.findAll();
    }
    @GetMapping("findCourseById")
    public Course findCourseById(Long id) {

        return courseService.findCourseById(id);
    }


    @GetMapping("insertOrUpdate")
    public void insertOrUpdate(Course course) throws Exception {
       courseService.insertOrUpdate(course);

    }

    @GetMapping("deleteCourseById")
    public void deleteCourseById(Long id) throws Exception {
        courseService.deleteCourseById(id);
    }

    @GetMapping("query")
    public List<Course> query(Course course) {

        return courseService.query(course);
    }

    @GetMapping("selectAllWithTeacher")
    public List<CourseExtend> selectAllWithTeacher(){
        return courseService.selectAllWithTeacher();
    }








}
