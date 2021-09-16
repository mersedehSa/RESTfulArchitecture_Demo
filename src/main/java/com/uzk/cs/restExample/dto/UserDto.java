package com.uzk.cs.restExample.dto;

import java.util.ArrayList;
import java.util.List;


public class UserDto {
    Integer userId;
    String userName;
    List<CoursesDto> courseDtos= new ArrayList<>();

    public UserDto(Integer userId, String userName, List<CoursesDto> courseDtos) {
        this.userId = userId;
        this.userName = userName;
        this.courseDtos = courseDtos;
    }

    public UserDto() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<CoursesDto> getCourseDtos() {
        return courseDtos;
    }

    public void setCoursDtos(List<CoursesDto> courseDtos) {
        this.courseDtos = courseDtos;
    }
}
