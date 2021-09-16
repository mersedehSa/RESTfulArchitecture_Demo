package com.uzk.cs.restExample.dto;


public class CoursesDto {
    Integer courseId;
    String CourseName;

    public CoursesDto(Integer courseId, String courseName) {
        this.courseId = courseId;
        CourseName = courseName;
    }

    public CoursesDto() {
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
    	CourseName = courseName;
    }
}

