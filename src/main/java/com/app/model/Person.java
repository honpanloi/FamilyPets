package com.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "person", schema = "familypets")
public class Person {

	@Id
	@GeneratedValue(generator = "person_id_seq", strategy = GenerationType.AUTO) // auto incremented value
    @SequenceGenerator(allocationSize = 1, name = "person_id_seq", sequenceName = "person_id_seq")
	private int person_id;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "first_name", nullable = false)
	private String first_name;
	
	@Column(name = "last_name", nullable = false)
	private String last_name;
	
	@Column(name = "is_breeder", nullable = false)
	private boolean is_breeder;
	
	@Column(name="dateOfBirth", nullable = false)
	private Date dob;
	
	@Column(name = "phone_number", nullable = false)
	private long phone_number;
	
	@Column(name ="city", nullable = false)
	private String city;

	public Person() {
		super();
	
	}

	public Person(int person_id, String email, String first_name, String last_name, boolean is_breeder, Date dob,
			long phone_number, String city) {
		super();
		this.person_id = person_id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.is_breeder = is_breeder;
		this.dob = dob;
		this.phone_number = phone_number;
		this.city = city;
	}

	public int getperson_id() {
		return person_id;
	}

	public void setperson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getfirst_name() {
		return first_name;
	}

	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getlast_name() {
		return last_name;
	}

	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}

	public boolean is_breeder() {
		return is_breeder;
	}

	public void setBreeder(boolean is_breeder) {
		this.is_breeder = is_breeder;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getphone_number() {
		return phone_number;
	}

	public void setphone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + person_id;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + (is_breeder ? 1231 : 1237);
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + (int) (phone_number ^ (phone_number >>> 32));
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
		Person other = (Person) obj;
		if (person_id != other.person_id)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (is_breeder != other.is_breeder)
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (phone_number != other.phone_number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "person [person_id=" + person_id + ", email=" + email + ", first_name=" + first_name + ", last_name="
				+ last_name + ", is_breeder=" + is_breeder + ", dob=" + dob + ", phone_number=" + phone_number + ", city="
				+ city + "]";
	}
	
	
	
	
	
}
