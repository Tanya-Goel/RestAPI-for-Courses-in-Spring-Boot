package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.services.CourseServices;

@RestController
public class MyController {

	@Autowired
	private CourseServices courseService;


	@GetMapping("/getCourses")
	public List<Courses> getCourses() {
		return this.courseService.getCourses();
	}

	@GetMapping("/Courses/{courseId}")
	public Courses getCourseId(@PathVariable String courseId) {
		return this.courseService.getCourseId(Long.parseLong(courseId));
	}

	@PostMapping("/Courses")
	public List<Courses> addCourses(@RequestBody Courses course) {
		return this.courseService.addCourses(course);
	}

	@DeleteMapping("/Courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourseDetails(@PathVariable String courseId) {
		try {
			this.courseService.deleteCourses(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/Courses/{courseId}")
	public void updateCourseDetails(@RequestBody Courses courses, @PathVariable String courseId) {
		courseService.updateCourses(courses, Long.parseLong(courseId));
	}
}
