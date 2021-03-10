package com.revature.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "request")
public class Request {
	@Id
	@GeneratedValue(generator = "request_id_seq", strategy = GenerationType.AUTO) // auto incremented value
	@SequenceGenerator(allocationSize = 1, name = "request_id_seq", sequenceName = "request_id_seq")
	@Column
	private int request_id;
	
	@ManyToOne
	@Column(name="buyer_id")
	private Person buyer_id;
	
	@ManyToOne
	@Column(name ="breeder_id")
	private int breeder_id;
	
	@Column(name="dateIssued")
	private Date dateIssued;	
	
	@Column(name ="dateAccepted")
	private Date dateAccepted;
	
	@Column(name="requestStatus")
	private String requestStatus;

	
	
	
	
	
}
