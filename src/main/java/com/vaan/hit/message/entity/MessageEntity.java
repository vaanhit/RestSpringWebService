package com.vaan.hit.message.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rohit
 *
 *	
 */
@Entity
@XmlRootElement
public class MessageEntity {
	
	@Id
	@GeneratedValue
	private long id;
	private String message;
	private Date created;
	private String author;

	
	//@DateTimeFormat(pattern="MM/dd/yyyy")
	public MessageEntity() {
		// No argument Constructor  
	}

	public MessageEntity(String message, String author) {
		this.message = message;
		this.created = new Date();
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}



