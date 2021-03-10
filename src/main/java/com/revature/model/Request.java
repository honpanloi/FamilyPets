package com.revature.model;

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

@Entity
@Table(name = "request", schema = "familypets")
public class Request {
	@Id
	@GeneratedValue(generator = "request_id_seq", strategy = GenerationType.AUTO) // auto incremented value
	@SequenceGenerator(allocationSize = 1, name = "request_id_seq", sequenceName = "request_id_seq")
	@Column
	private int request_id;
	
	@ManyToOne
	@JoinColumn(name="buyer_id")
	private Person buyer_id;
	
	@ManyToOne
	@JoinColumn(name ="breeder_id")
	private Person breeder_id;
	
	@Column(name="dateIssued")
	private Date dateIssued;	
	
	@Column(name ="dateAccepted")
	private Date dateAccepted;
	
	@Column(name="requestStatus")
	private String requestStatus;

	@Column(name="animal", nullable = false)
	private String animal;
	
	@Column(name="breed")
	private String breed;
	
	@Column(name="photoLink", nullable = true)
	private String photoLink;

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(int request_id, Person buyer_id, Person breeder_id, Date dateIssued, Date dateAccepted,
			String requestStatus, String animal, String breed, String photoLink) {
		super();
		this.request_id = request_id;
		this.buyer_id = buyer_id;
		this.breeder_id = breeder_id;
		this.dateIssued = dateIssued;
		this.dateAccepted = dateAccepted;
		this.requestStatus = requestStatus;
		this.animal = animal;
		this.breed = breed;
		this.photoLink = photoLink;
	}

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public Person getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(Person buyer_id) {
		this.buyer_id = buyer_id;
	}

	public Person getBreeder_id() {
		return breeder_id;
	}

	public void setBreeder_id(Person breeder_id) {
		this.breeder_id = breeder_id;
	}

	public Date getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	public Date getDateAccepted() {
		return dateAccepted;
	}

	public void setDateAccepted(Date dateAccepted) {
		this.dateAccepted = dateAccepted;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
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

	public String getPhotoLink() {
		return photoLink;
	}

	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((breeder_id == null) ? 0 : breeder_id.hashCode());
		result = prime * result + ((buyer_id == null) ? 0 : buyer_id.hashCode());
		result = prime * result + ((dateAccepted == null) ? 0 : dateAccepted.hashCode());
		result = prime * result + ((dateIssued == null) ? 0 : dateIssued.hashCode());
		result = prime * result + ((photoLink == null) ? 0 : photoLink.hashCode());
		result = prime * result + ((requestStatus == null) ? 0 : requestStatus.hashCode());
		result = prime * result + request_id;
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
		if (breeder_id == null) {
			if (other.breeder_id != null)
				return false;
		} else if (!breeder_id.equals(other.breeder_id))
			return false;
		if (buyer_id == null) {
			if (other.buyer_id != null)
				return false;
		} else if (!buyer_id.equals(other.buyer_id))
			return false;
		if (dateAccepted == null) {
			if (other.dateAccepted != null)
				return false;
		} else if (!dateAccepted.equals(other.dateAccepted))
			return false;
		if (dateIssued == null) {
			if (other.dateIssued != null)
				return false;
		} else if (!dateIssued.equals(other.dateIssued))
			return false;
		if (photoLink == null) {
			if (other.photoLink != null)
				return false;
		} else if (!photoLink.equals(other.photoLink))
			return false;
		if (requestStatus == null) {
			if (other.requestStatus != null)
				return false;
		} else if (!requestStatus.equals(other.requestStatus))
			return false;
		if (request_id != other.request_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Request [request_id=" + request_id + ", buyer_id=" + buyer_id + ", breeder_id=" + breeder_id
				+ ", dateIssued=" + dateIssued + ", dateAccepted=" + dateAccepted + ", requestStatus=" + requestStatus
				+ ", animal=" + animal + ", breed=" + breed + ", photoLink=" + photoLink + "]";
	}
	
		
}
