package com.Spring_Boot.CRUD_h2database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Spring_Boot.CRUD_h2database.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
