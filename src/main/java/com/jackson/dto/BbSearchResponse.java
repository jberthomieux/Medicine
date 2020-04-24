package com.jackson.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_DEFAULT)
//@Table(name="BloodBank")
//@Entity
public class BbSearchResponse {

private int id;
private double price;
private int qty;
private String type;
//boolean bb24h;
//private int bbId;
//private String number;
//private String name;
//private String city;
  //private String bbarea;
//private String bbAddress;
//public int getId() {
//	return id;
//}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
//public BbSearchResponse(int id, double price, int qty, String type) {
//	super();
//	this.id = id;
//	this.price = price;
//	this.qty = qty;
//	this.type = type;
//}
public BbSearchResponse() {
	super();
}


}
