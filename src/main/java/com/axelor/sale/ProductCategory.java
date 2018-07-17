package com.axelor.sale;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.yahoo.elide.annotation.Include;

@Entity
@Table(name = "product_category")
@Include(rootLevel = false)
public class ProductCategory {

	@Id
	public Long id;
	
	private String code;
	
	private String name;
	
	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductCategory(Long id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
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
	
}
