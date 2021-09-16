package com.uzk.cs.restExample.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.uzk.cs.restExample.dto.CoursesDto;
import com.uzk.cs.restExample.dto.UserDto;
import com.uzk.cs.restExample.entity.Course;
import com.uzk.cs.restExample.entity.User;
import com.uzk.cs.restExample.repository.UserRepository;

@Service("UserService")
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	
	public UserDto getUserById(Integer userId) {
		return this.entityToDto(userRepository.getOne(userId));
	}

	
	public void saveUser(UserDto userDto) {
		userRepository.save(dtoToEntity(userDto));
	}

	
	public List<UserDto> getAllUsers() {
		return userRepository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	
	//Convert to DTO User
	private  User dtoToEntity(UserDto userDto) {
		User user = new User(userDto.getUserName(), null);
		user.setUserId(userDto.getUserId());
		user.setCourses(userDto.getCourseDtos().stream().map(this::dtoToEntity).collect(Collectors.toList()));
		return user;
	}

	private   UserDto entityToDto(User user) {
		UserDto userDto = new UserDto(user.getUserId(), user.getUserName(), null);
		userDto.setCoursDtos(user.getCourses().stream().map(this::entityToDto).collect(Collectors.toList()));
		return userDto;
	}
	
	//Convert to DTO Course
	private Course dtoToEntity(CoursesDto courseDto) {
		Course Course = new Course(courseDto.getCourseName(), null);
		Course.setSkillId(courseDto.getCourseId());
		return Course;
	}

	private CoursesDto entityToDto(Course course) {
		return new CoursesDto(course.getSkillId(), course.getSkillName());
	}
}
