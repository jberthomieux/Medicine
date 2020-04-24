package com.jackson.dto;

public class MsSearchResponse {
	private String name;
	private String medshopAddress;
	private String medshoparea;
	private double price;
	private int qty;
	
	public MsSearchResponse(String name, String medshopAddress, String medshoparea, double price, int qty) {
		super();
		this.name = name;
		this.medshopAddress = medshopAddress;
		this.medshoparea = medshoparea;
		this.price = price;
		this.qty = qty;
	}
	public MsSearchResponse() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getMedshopAddress() {
		return medshopAddress;
	}
	public void setMedshopAddress(String medshopAddress) {
		this.medshopAddress = medshopAddress;
	}
	public String getMedshoparea() {
		return medshoparea;
	}
	public void setMedshoparea(String medshoparea) {
		this.medshoparea = medshoparea;
	}

}
