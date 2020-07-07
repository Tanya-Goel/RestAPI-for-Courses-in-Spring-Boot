package com.example.demo.services;

import com.example.demo.entities.Courses;
import java.util.List;

public interface CourseServices {
 
	public List<Courses> getCourses();
	public Courses getCourseId(long courseId);
	public List<Courses> addCourses(Courses course);
	public void deleteCourses(long courseId);
	public void updateCourses(Courses courses, long courseId);
}
