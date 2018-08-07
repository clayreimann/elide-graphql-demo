package com.axelor.repository.beans.sale;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.yahoo.elide.annotation.Include;

@Entity
@Table(name = "product")
@Include(rootLevel = false)
public class Product {
	
	@Id
	public Long id;
	
	private String code;
	
	private String name;
	
	private String color;
	
	@ManyToOne
	public ProductCategory category;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long id, String code, String name, String color) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
