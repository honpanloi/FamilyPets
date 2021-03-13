package com.app.model;

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
@Table(name = "message", schema = "familypets")
public class Message 
{
	@Id
	@GeneratedValue(generator = "familypets.messageid_seq", strategy = GenerationType.AUTO) // auto incremented value
    @SequenceGenerator(allocationSize = 1, name = "familypets.messageid_seq", sequenceName = "familypets.messageid_seq")
	@Column(name = "messageid")
	@ColumnDefault("nextval('familypets.messageid_seq'::regclass)")
	private int messageid;
	
	@ManyToOne
	@JoinColumn(name ="personid", nullable = false)
	private Person senderid;
	
	@ManyToOne
	@JoinColumn(name = "requestid", nullable = false)
	private Request requestid;
	
	@Column(name = "content", nullable = false)
	private String content;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(int messageid, Person senderid, Request requestid, String content) {
		super();
		this.messageid = messageid;
		this.senderid = senderid;
		this.requestid = requestid;
		this.content = content;
	}

	public int getmessageid() {
		return messageid;
	}

	public void setmessageid(int messageid) {
		this.messageid = messageid;
	}

	public Person getsenderid() {
		return senderid;
	}

	public void setsenderid(Person senderid) {
		this.senderid = senderid;
	}

	public Request getrequestid() {
		return requestid;
	}

	public void setrequestid(Request requestid) {
		this.requestid = requestid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + messageid;
		result = prime * result + ((requestid == null) ? 0 : requestid.hashCode());
		result = prime * result + ((senderid == null) ? 0 : senderid.hashCode());
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
		Message other = (Message) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (messageid != other.messageid)
			return false;
		if (requestid == null) {
			if (other.requestid != null)
				return false;
		} else if (!requestid.equals(other.requestid))
			return false;
		if (senderid == null) {
			if (other.senderid != null)
				return false;
		} else if (!senderid.equals(other.senderid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Message [messageid=" + messageid + ", senderid=" + senderid + ", requestid=" + requestid
				+ ", content=" + content + "]";
	}
	
	
	
	
}
