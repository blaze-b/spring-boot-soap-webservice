package com.boot.webservices.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.webservices.model.Students;
import com.boot.webservices.service.StudentService;
import com.webservices.xml.school.Student;

@Component
public class StudentRepo {
	private static final Map<String, Student> studentMap = new HashMap<String, Student>();
	@Autowired
	private StudentService studentService;

	public Student findStudent(String name) {
		Student student = new Student();
		Students students = studentService.findStudent(name);
		student.setName(students.getName());
		student.setStandard(students.getStandard());
		student.setAddress(students.getAddress());
		studentMap.put(student.getName(), student);
		return studentMap.get(name);
	}
}
