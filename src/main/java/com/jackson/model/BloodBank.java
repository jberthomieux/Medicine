package com.jackson.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;



@Entity(name="BloodBank")
public class BloodBank {
	@Id
	@Column(name = "id")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String type;
//	@Column
//	private String location;
	@Column
	private int qty;
	@Column
	private double price;

	public BloodBank(int id, String type, String location, int qty, double price) {
		super();
		this.id = id;
		this.type = type;
		//this.location = location;
		this.qty = qty;
		this.price = price;
	}
	public BloodBank() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BloodBank [id=" + id + ", type=" + type +  ", qty=" + qty + ", price=" + price
				+ "]";
	}
	
}
