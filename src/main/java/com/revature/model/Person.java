package com.revature.model;

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
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "isBreeder")
	private boolean isBreeder;
	
	@Column(name="dateOfBirth")
	private Date dob;
	
	@Column(name = "phoneNumber")
	private long phoneNumber;
	
	@Column(name ="city")
	private String city;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int person_id, String email, String firstName, String lastName, boolean isBreeder, Date dob,
			long phoneNumber, String city) {
		super();
		this.person_id = person_id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isBreeder = isBreeder;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isBreeder() {
		return isBreeder;
	}

	public void setBreeder(boolean isBreeder) {
		this.isBreeder = isBreeder;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + (isBreeder ? 1231 : 1237);
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
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
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (isBreeder != other.isBreeder)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "person [person_id=" + person_id + ", email=" + email + ", firstName=" + firstName + ", lastName="
				+ lastName + ", isBreeder=" + isBreeder + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", city="
				+ city + "]";
	}
	
	
	
	
	
}
