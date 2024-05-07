package com.example.jpahibernate.demo.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpahibernate.demo.course.Course;

@Component
public class coursejdbccommandlinerunner implements CommandLineRunner{
    @Autowired
	private jdbctemplate obj;
	@Override
	public void run(String... args) throws Exception {
		obj.jdbctemplate1(new Course(1,"once upon a time in mumbai","Nihal Mishra"));
		obj.jdbctemplate1(new Course(2,"anjana anjani","Adarsh Mishra"));
		obj.jdbctemplate1(new Course(3,"jhalak dikhala ja","Aditya Mishra"));
		obj.deletquery(1);
		//obj.Retrieve1(2);
		System.out.println(obj.Retrieve1(3));
	}
}
