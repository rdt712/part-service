package com.toler.dtlp.part.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Part {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String partNumber;
	
	@Column
	private String name;
	
	@Column
	private Double price;
	
	@Column
	private Integer quantity;
	
	@Column
	private String description;
	
	@Column
	private Long computerId;
	
	public Part() { }

	public Part(Long id, String partNumber, String name, Double price, Integer quantity, String description, Long computerId) {
		this.id = id;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.computerId = computerId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getComputerId() {
		return computerId;
	}

	public void setComputerId(Long computerId) {
		this.computerId = computerId;
	}
}
