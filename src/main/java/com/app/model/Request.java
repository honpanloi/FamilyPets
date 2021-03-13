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

@Entity
@Table(name = "request", schema = "familypets")
public class Request {
	@Id
	@GeneratedValue(generator = "familypets.request_id_seq", strategy = GenerationType.AUTO) // auto incremented value
	@SequenceGenerator(allocationSize = 1, name = "familypets.request_id_seq", sequenceName = "familypets.request_id_seq")
	@Column(name="request_id")
	private int request_id;
	
	@ManyToOne
	@JoinColumn(name="buyer_id", nullable = false)
	private Person buyer_id;
	
	@ManyToOne
	@JoinColumn(name ="breeder_id")
	private Person breeder_id;
	
	@Column(name="date_issued", nullable = false)
	private Date date_issued;	
	
	@Column(name ="date_accepted")
	private Date date_accepted;
	
	@Column(name="request_status", nullable = false)
	private String request_status;

	@Column(name="animal", nullable = false)
	private String animal;
	
	@Column(name="breed", nullable = false)
	private String breed;
	
	@Column(name="photo_link", nullable = true)
	private String photo_link;

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(int request_id, Person buyer_id, Person breeder_id, Date date_issued, Date date_accepted,
			String request_status, String animal, String breed, String photo_link) {
		super();
		this.request_id = request_id;
		this.buyer_id = buyer_id;
		this.breeder_id = breeder_id;
		this.date_issued = date_issued;
		this.date_accepted = date_accepted;
		this.request_status = request_status;
		this.animal = animal;
		this.breed = breed;
		this.photo_link = photo_link;
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

	public Date getdate_issued() {
		return date_issued;
	}

	public void setdate_issued(Date date_issued) {
		this.date_issued = date_issued;
	}

	public Date getdate_accepted() {
		return date_accepted;
	}

	public void setdate_accepted(Date date_accepted) {
		this.date_accepted = date_accepted;
	}

	public String getrequest_status() {
		return request_status;
	}

	public void setrequest_status(String request_status) {
		this.request_status = request_status;
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

	public String getphoto_link() {
		return photo_link;
	}

	public void setphoto_link(String photo_link) {
		this.photo_link = photo_link;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((breeder_id == null) ? 0 : breeder_id.hashCode());
		result = prime * result + ((buyer_id == null) ? 0 : buyer_id.hashCode());
		result = prime * result + ((date_accepted == null) ? 0 : date_accepted.hashCode());
		result = prime * result + ((date_issued == null) ? 0 : date_issued.hashCode());
		result = prime * result + ((photo_link == null) ? 0 : photo_link.hashCode());
		result = prime * result + ((request_status == null) ? 0 : request_status.hashCode());
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
		if (date_accepted == null) {
			if (other.date_accepted != null)
				return false;
		} else if (!date_accepted.equals(other.date_accepted))
			return false;
		if (date_issued == null) {
			if (other.date_issued != null)
				return false;
		} else if (!date_issued.equals(other.date_issued))
			return false;
		if (photo_link == null) {
			if (other.photo_link != null)
				return false;
		} else if (!photo_link.equals(other.photo_link))
			return false;
		if (request_status == null) {
			if (other.request_status != null)
				return false;
		} else if (!request_status.equals(other.request_status))
			return false;
		if (request_id != other.request_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Request [request_id=" + request_id + ", buyer_id=" + buyer_id + ", breeder_id=" + breeder_id
				+ ", date_issued=" + date_issued + ", date_accepted=" + date_accepted + ", request_status=" + request_status
				+ ", animal=" + animal + ", breed=" + breed + ", photo_link=" + photo_link + "]";
	}
	
		
}
