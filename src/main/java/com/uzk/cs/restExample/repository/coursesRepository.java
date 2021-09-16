package com.uzk.cs.restExample.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uzk.cs.restExample.entity.Course;


@Repository
public interface coursesRepository extends JpaRepository<Course, Integer>{
}
