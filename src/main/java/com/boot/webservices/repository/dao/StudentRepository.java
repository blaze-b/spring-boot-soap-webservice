package com.boot.webservices.repository.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import com.boot.webservices.model.Students;


public interface StudentRepository extends JpaRepository<Students, Long> {
	public Students findByName(String name);

}
