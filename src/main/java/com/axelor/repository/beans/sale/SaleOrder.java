package com.axelor.repository.beans.sale;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.axelor.repository.beans.Contact;
import com.yahoo.elide.annotation.Include;

@Entity
@Table(name = "sale_order")
@Include(rootLevel = true)
public class SaleOrder {
	
	@Id
	public Long id;
	
	@ManyToOne
	public Contact customer;
	
	private String name;
	
	@OneToMany(mappedBy="saleOrder")
	public List<OrderLine> items;

	public SaleOrder() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
