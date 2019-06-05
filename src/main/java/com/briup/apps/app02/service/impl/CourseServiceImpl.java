package com.briup.apps.app02.service.impl;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.extend.CourseExtend;
import com.briup.apps.app02.dao.CourseMapper;
import com.briup.apps.app02.dao.UserMapper;
import com.briup.apps.app02.dao.extend.CourseExtendMapper;
import com.briup.apps.app02.service.ICourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
     @Service
public class CourseServiceImpl implements ICourseService {
     @Resource()
     private CourseMapper courseMapper;
     @Resource
     private CourseExtendMapper courseExtendMapper;

         @Override
         public List<CourseExtend> selectAllWithTeacher() {
             return courseExtendMapper.selectAll();
         }

         @Override
         public List<Course> findAll() {
             return courseMapper.findAll();
         }

         @Override
         public Course findCourseById(Long id) {
             return courseMapper.findCourseById(id);
         }

         @Override
         public void insertOrUpdate(Course course) throws Exception {
             if(course.getId()==null){
                    courseMapper.insertCourse(course);
             }else{
            courseMapper.updateCourse(course);
             }

         }

         @Override
         public void deleteCourseById(Long id) throws Exception {
                courseMapper.deleteCourseById(id);
         }

         @Override
         public List<Course> query(Course course) {
             return courseMapper.query(course);
         }
     }
