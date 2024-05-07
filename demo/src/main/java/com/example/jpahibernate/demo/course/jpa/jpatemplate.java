package com.example.jpahibernate.demo.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jpahibernate.demo.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class jpatemplate {
  @Autowired
  private EntityManager entitymanager;
  
  public void insert(Course course) {
	  entitymanager.merge(course);
  }
}
