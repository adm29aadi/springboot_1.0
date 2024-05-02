package com.example.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
 
@RequestMapping("/courses")
 public List<Course> retrievecourses(){
	 return Arrays.asList(
		new Course(1, "Springboot", "Adarsh"),
		new Course(2, "Spring", "Nihal")
			 );
 }
}
