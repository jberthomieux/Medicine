package com.jackson.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class SearchResponse {
private String name;
private String bbAddress;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBbAddress() {
	return bbAddress;
}
public void setBbAddress(String bbAddress) {
	this.bbAddress = bbAddress;
}
public SearchResponse() {
	super();
}
public SearchResponse(String name, String bbAddress) {
	super();
	this.name = name;
	this.bbAddress = bbAddress;
}
}
