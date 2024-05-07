package com.example.jpahibernate.demo.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpahibernate.demo.course.Course;

@Component
public class jpacommandlinerunner implements CommandLineRunner{
    
	@Autowired
	private jpatemplate jpa1;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		jpa1.insert(new Course(10,"rs agrawal","rahul"));
	}
}
