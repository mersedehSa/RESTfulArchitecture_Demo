package com.uzk.cs.restExample;

import com.uzk.cs.restExample.entity.Course;
import com.uzk.cs.restExample.entity.User;
import com.uzk.cs.restExample.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class Demo1Application {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		User user= new User("Mersedeh", null);
		user.setCourses(Arrays.asList(new Course("SE1"), new Course("DB")));
		user= userRepository.save(user);
	}

}
