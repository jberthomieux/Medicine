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
private String type;
private double price;
private String bbarea;
private String bbAddress;
private int qty;
public BbSearchResponse(String type, double price, String bbarea, String bbAddress, int qty) {
	super();
	this.type = type;
	this.price = price;
	this.bbarea = bbarea;
	this.bbAddress = bbAddress;
	this.qty = qty;
}
public BbSearchResponse() {
	super();
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getBbarea() {
	return bbarea;
}
public void setBbarea(String bbarea) {
	this.bbarea = bbarea;
}
public String getBbAddress() {
	return bbAddress;
}
public void setBbAddress(String bbAddress) {
	this.bbAddress = bbAddress;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
} 

}
