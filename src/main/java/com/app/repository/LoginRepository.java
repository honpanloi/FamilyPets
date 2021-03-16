package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.Person;
import com.app.model.PersonLogin;

@Repository(value="loginRepository")
public interface LoginRepository extends JpaRepository<PersonLogin, String>{
	
//	@Query(value = "select l from PersonLogin l where l.email = :email and l.password = :password")
//	PersonLogin findByLogin (@Param("email") String email, @Param("password") String password);
	
	public PersonLogin findByEmailAndPassword(String email, String password);

}
