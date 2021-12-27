package com.java.springboot.data.course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	@RequestMapping("/courses")
	public List<Course> getAllCourse() {
		System.out.println(courseService);
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/course/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {
		System.out.println(courseService);
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/courses")
	public void addTopic(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
	public String updateTopic(@RequestBody Course course,@PathVariable String id) {
		
		courseService.updateCourse(id,course);
		return "Course has been updated successfully";
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "course/{id}")
	public void deleteCourse(@PathVariable String id) {
		
		courseService.deleteCourse(id);
	}
}
