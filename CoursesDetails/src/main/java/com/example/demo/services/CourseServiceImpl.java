package com.example.demo.services;

import com.example.demo.entities.Courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseServices {
	List<Courses> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses(1, "Gooseberry", "Amazing content"));
	}

	@Override
	public List<Courses> getCourses() {
		return list;
	}

	@Override
	public Courses getCourseId(long courseId) {
		Courses id = null;
		for (Courses c : list) {
			if (c.getId() == courseId) {
				id = c;
				break;
			}
		}
		return id;
	}

	@Override
	public List<Courses> addCourses(Courses course) {
		list.add(course);
		return list;
	}

	@Override
	public void deleteCourses(long courseId) {
		for (Courses c : list) {
			if (c.getId() == courseId) {
				list.remove(c);
			}
		}
	}

	@Override
	public void updateCourses(Courses courses, long courseId) {

		list.forEach(e -> {
			if (courseId == e.getId()) {
				e.setTitle(courses.getTitle());
				e.setDescription(courses.getDescription());
			}
		});
	}

}
