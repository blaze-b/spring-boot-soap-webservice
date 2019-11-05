package com.boot.webservices.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import com.boot.webservices.model.Students;
import com.boot.webservices.repository.dao.StudentRepository;

@Service
public class StudentSeviceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Students findStudent(String name) {
		Assert.notNull(name, "The Student's name must not be null");
		return studentRepository.findByName(name);
	}

}
