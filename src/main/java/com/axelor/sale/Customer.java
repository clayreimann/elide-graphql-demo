package com.axelor.sale;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.yahoo.elide.annotation.Include;

@Entity
@Table(name = "customer")
@Include(rootLevel = true)
public class Customer {

	@Id
	public Long id;

	private String firstName;

	private String lastName;

	private String email;

	private String phone;

	public Customer() {

	}

	public Customer(Long id, String firstName, String lastName, String email, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	 public Long getId() {
	 return id;
	 }
	
	 public void setId(Long id) {
	 this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	public List<Address> getAddresses() {
//		return addresses;
//	}
//
//	public void setAddresses(List<Address> addresses) {
//		this.addresses = addresses;
//	}

}
