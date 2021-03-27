package com.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "request", schema = "familypets")
public class Request {
	@Id
	@GeneratedValue(generator = "familypets.requestid_seq", strategy = GenerationType.AUTO) // auto incremented value
	@SequenceGenerator(allocationSize = 1, name = "familypets.requestid_seq", sequenceName = "familypets.requestid_seq")
	@Column(name="requestid")
	@ColumnDefault("nextval('familypets.requestid_seq'::regclass)")
	private int requestid;
	
	@ManyToOne
	@JoinColumn(name="buyerid", nullable = false)
//	@Column
	private Person buyerid;
	
	@ManyToOne
	@JoinColumn(name ="breederid")
	private Person breederid;
	
	@Column(name="dateissued", nullable = false)
	private Date dateissued;	
	
	@Column(name ="dateaccepted")
	private Date dateaccepted;
	
	@Column(name="requeststatus", nullable = false)
	private String requeststatus;

	@Column(name="animal", nullable = false)
	private String animal;
	
	@Column(name="breed", nullable = false)
	private String breed;
	
	@Column(name="photolink", nullable = true)
	private String photolink;

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(int requestid, Person buyerid, Person breederid, Date dateissued, Date dateaccepted,
			String requeststatus, String animal, String breed, String photolink) {
		super();
		this.requestid = requestid;
		this.buyerid = buyerid;
		this.breederid = breederid;
		this.dateissued = dateissued;
		this.dateaccepted = dateaccepted;
		this.requeststatus = requeststatus;
		this.animal = animal;
		this.breed = breed;
		this.photolink = photolink;
	}

	public int getRequestid() {
		return requestid;
	}

	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}

	public Person getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(Person buyerid) {
		this.buyerid = buyerid;
	}

	public Person getBreederid() {
		return breederid;
	}

	public void setBreederid(Person breederid) {
		this.breederid = breederid;
	}

	public Date getDateissued() {
		return dateissued;
	}

	public void setDateissued(Date dateissued) {
		this.dateissued = dateissued;
	}

	public Date getDateaccepted() {
		return dateaccepted;
	}

	public void setDateaccepted(Date dateaccepted) {
		this.dateaccepted = dateaccepted;
	}

	public String getRequeststatus() {
		return requeststatus;
	}

	public void setRequeststatus(String requeststatus) {
		this.requeststatus = requeststatus;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getPhotolink() {
		return photolink;
	}

	public void setPhotolink(String photolink) {
		this.photolink = photolink;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((breederid == null) ? 0 : breederid.hashCode());
		result = prime * result + ((buyerid == null) ? 0 : buyerid.hashCode());
		result = prime * result + ((dateaccepted == null) ? 0 : dateaccepted.hashCode());
		result = prime * result + ((dateissued == null) ? 0 : dateissued.hashCode());
		result = prime * result + ((photolink == null) ? 0 : photolink.hashCode());
		result = prime * result + requestid;
		result = prime * result + ((requeststatus == null) ? 0 : requeststatus.hashCode());
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
		Request other = (Request) obj;
		if (animal == null) {
			if (other.animal != null)
				return false;
		} else if (!animal.equals(other.animal))
			return false;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (breederid == null) {
			if (other.breederid != null)
				return false;
		} else if (!breederid.equals(other.breederid))
			return false;
		if (buyerid == null) {
			if (other.buyerid != null)
				return false;
		} else if (!buyerid.equals(other.buyerid))
			return false;
		if (dateaccepted == null) {
			if (other.dateaccepted != null)
				return false;
		} else if (!dateaccepted.equals(other.dateaccepted))
			return false;
		if (dateissued == null) {
			if (other.dateissued != null)
				return false;
		} else if (!dateissued.equals(other.dateissued))
			return false;
		if (photolink == null) {
			if (other.photolink != null)
				return false;
		} else if (!photolink.equals(other.photolink))
			return false;
		if (requestid != other.requestid)
			return false;
		if (requeststatus == null) {
			if (other.requeststatus != null)
				return false;
		} else if (!requeststatus.equals(other.requeststatus))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Request [requestid=" + requestid + ", buyerid=" + buyerid + ", breederid=" + breederid + ", dateissued="
				+ dateissued + ", dateaccepted=" + dateaccepted + ", requeststatus=" + requeststatus + ", animal="
				+ animal + ", breed=" + breed + ", photolink=" + photolink + "]";
	}

			
		
}
