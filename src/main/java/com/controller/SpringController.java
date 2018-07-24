package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.respository.StudentRepository;


@RestController
public class SpringController {
	
	@Autowired
	StudentRepository st;
	
	@RequestMapping("/student")
	public List<Student> welcome() {
		List<Student> s = (List<Student>) st.findAll();
		System.out.println("-------------student----------"+s.toString());
		return s;
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Well come to Spring boot Restfull";
	}

}
