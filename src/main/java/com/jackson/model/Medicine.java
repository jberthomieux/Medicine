package com.jackson.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medicine")
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	//@ManyToOne
	//@JoinColumn(name="bb_fk", referencedColumnName = "medId")
	//private int bbid;
	private int qty;
	private double price;
	public int getId() {
		return id;
	}
	public Medicine(int id, String name, int bbid, int qty, double price) {
		super();
		this.id = id;
		this.name = name;
		//this.bbid = bbid;
		this.qty = qty;
		this.price = price;
	}
//	public int getBbid() {
//		return bbid;
//	}
//	public void setBbid(int bbid) {
//		this.bbid = bbid;
//	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
	//}
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
	
	public Medicine() {
		super();
	}
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ",  qty=" + qty + ", price=" + price
				+ "]";
	}

}
