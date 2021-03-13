package com.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "person", schema = "familypets")
public class Person {

	@Id
	@Column(name = "personid")
	@GeneratedValue(generator = "familypets.personid_seq", strategy = GenerationType.AUTO) // auto incremented value
    @SequenceGenerator(allocationSize = 1, name = "familypets.personid_seq", sequenceName = "familypets.personid_seq")
	@ColumnDefault("nextval('familypets.personid_seq'::regclass)")
	private int personid;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "firstname", nullable = false)
	private String firstname;
	
	@Column(name = "lastname", nullable = false)
	private String lastname;
	
	@Column(name = "isbreeder", nullable = false)
	private boolean isbreeder;
	
	@Column(name="dateOfBirth", nullable = false)
	private Date dob;
	
	@Column(name = "phonenumber", nullable = false)
	private String phonenumber;
	
	@Column(name ="city", nullable = false)
	private String city;

	public Person() {
		super();
	
	}

	public Person(int personid, String email, String firstname, String lastname, boolean isbreeder, Date dob,
			String phonenumber, String city) {
		super();
		this.personid = personid;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.isbreeder = isbreeder;
		this.dob = dob;
		this.phonenumber = phonenumber;
		this.city = city;
	}

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isIsbreeder() {
		return isbreeder;
	}

	public void setIsbreeder(boolean isbreeder) {
		this.isbreeder = isbreeder;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + (isbreeder ? 1231 : 1237);
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + personid;
		result = prime * result + ((phonenumber == null) ? 0 : phonenumber.hashCode());
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
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (isbreeder != other.isbreeder)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (personid != other.personid)
			return false;
		if (phonenumber == null) {
			if (other.phonenumber != null)
				return false;
		} else if (!phonenumber.equals(other.phonenumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [personid=" + personid + ", email=" + email + ", firstname=" + firstname + ", lastname="
				+ lastname + ", isbreeder=" + isbreeder + ", dob=" + dob + ", phonenumber=" + phonenumber + ", city="
				+ city + "]";
	}

		
	
	
	
}
