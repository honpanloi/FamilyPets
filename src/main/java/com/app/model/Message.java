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
	@GeneratedValue(generator = "familypets.message_id_seq", strategy = GenerationType.AUTO) // auto incremented value
    @SequenceGenerator(allocationSize = 1, name = "familypets.message_id_seq", sequenceName = "familypets.message_id_seq")
	@Column(name = "message_id")
	@ColumnDefault("nextval('familypets.message_id_seq'::regclass)")
	private int message_id;
	
	@ManyToOne
	@JoinColumn(name ="person_id", nullable = false)
	private Person sender_id;
	
	@ManyToOne
	@JoinColumn(name = "request_id", nullable = false)
	private Request request_id;
	
	@Column(name = "content", nullable = false)
	private String content;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(int message_id, Person sender_id, Request request_id, String content) {
		super();
		this.message_id = message_id;
		this.sender_id = sender_id;
		this.request_id = request_id;
		this.content = content;
	}

	public int getMessage_id() {
		return message_id;
	}

	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}

	public Person getSender_id() {
		return sender_id;
	}

	public void setSender_id(Person sender_id) {
		this.sender_id = sender_id;
	}

	public Request getRequest_id() {
		return request_id;
	}

	public void setRequest_id(Request request_id) {
		this.request_id = request_id;
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
		result = prime * result + message_id;
		result = prime * result + ((request_id == null) ? 0 : request_id.hashCode());
		result = prime * result + ((sender_id == null) ? 0 : sender_id.hashCode());
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
		if (message_id != other.message_id)
			return false;
		if (request_id == null) {
			if (other.request_id != null)
				return false;
		} else if (!request_id.equals(other.request_id))
			return false;
		if (sender_id == null) {
			if (other.sender_id != null)
				return false;
		} else if (!sender_id.equals(other.sender_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Message [message_id=" + message_id + ", sender_id=" + sender_id + ", request_id=" + request_id
				+ ", content=" + content + "]";
	}
	
	
	
	
}
