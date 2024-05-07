package com.example.jpahibernate.demo.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jpahibernate.demo.course.Course;

@Repository
public class jdbctemplate {
  @Autowired
  private JdbcTemplate springjdbc;
  private String INSERT_QUERY=
		  """
  		insert into course ( id,name,author)
        values(?,?,?);
  		""";
  
  private String DELETE_QUERY=
		  """
  		delete from course where id=?;
  		""";
  
  private String SELECT_QUERY=
		  """
  		select * from course where id=?;
  		""";
  public  void jdbctemplate1(Course course) {
		springjdbc.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
	}
  public void deletquery(int id) {
	  springjdbc.update(DELETE_QUERY,id);
  }
  
  public Course Retrieve1(int id) {
	  return springjdbc.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
  }
}
