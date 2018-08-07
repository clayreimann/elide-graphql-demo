package com.axelor.repository.beans.sale;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;

import com.yahoo.elide.annotation.Include;

@Entity
@Table(name = "order_line")
@Include(rootLevel = true)
public class OrderLine {
	
	@Id
	public Long id;

	@ManyToOne
	public SaleOrder saleOrder;

	@ManyToOne
	public Product product;

	@DecimalMin("0.0")
	@Digits(integer = 16, fraction = 4)
	private BigDecimal price = BigDecimal.ZERO;

	private Integer quantity = 0;
	
	public OrderLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderLine(Long id, @DecimalMin("0.0") @Digits(integer = 16, fraction = 4) BigDecimal price,
			Integer quantity) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	

}
