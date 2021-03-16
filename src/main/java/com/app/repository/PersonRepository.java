package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.Person;

@Repository (value = "personRepository")
public interface PersonRepository extends JpaRepository<Person, Integer>{

	Person findByPersonid(@Param("personid") Integer personid);
	
}
