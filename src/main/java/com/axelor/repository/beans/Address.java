package com.axelor.repository.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.yahoo.elide.annotation.Include;

@Entity
@Table(name = "address")
@Include(rootLevel = true)
public class Address {
	
	@Id
	public Long id;
	
	@ManyToOne
	private Contact contact;
	
	private String street;

	public Address() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
	
	

}
