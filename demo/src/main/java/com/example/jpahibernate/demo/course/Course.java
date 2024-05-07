package com.example.jpahibernate.demo.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;

@Entity(name="course")
public class Course {
  public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


public Course() {
		super();
	}

  @Id
  @Column(name="id")
  private int id;
  @Column(name="name")
  private String name;
  @Column(name="author")
  private String author;
  
  
public Course(int id, String name, String author) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
}


public int getId() {
	return id;
}


public String getName() {
	return name;
}


public String getAuthor() {
	return author;
}


@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
}
}
