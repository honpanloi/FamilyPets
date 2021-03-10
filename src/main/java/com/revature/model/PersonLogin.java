package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personLogin", schema ="familypets")
public class PersonLogin {
	
@Id
@Column
private String email;
	
@Column(name = "password")
private String password;

@OneToOne
@JoinColumn (name ="person_id")
private Person person;

public PersonLogin() {
	super();
	// TODO Auto-generated constructor stub
}

public PersonLogin(String email, String password, Person person) {
	super();
	this.email = email;
	this.password = password;
	this.person = person;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((person == null) ? 0 : person.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PersonLogin other = (PersonLogin) obj;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (person == null) {
		if (other.person != null)
			return false;
	} else if (!person.equals(other.person))
		return false;
	return true;
}

@Override
public String toString() {
	return "PersonLogin [email=" + email + ", password=" + password + ", person=" + person + "]";
}



    

}
