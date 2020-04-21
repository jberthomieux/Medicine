package com.jackson.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jackson.model.BloodBankShop;



//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class BloodBankRequest {
private BloodBankShop bbshop;

public BloodBankRequest() {
	super();
}

public BloodBankRequest(BloodBankShop bbshop) {
	super();
	this.bbshop = bbshop;
}

public BloodBankShop getBbshop() {
	return bbshop;
}

public void setBbshop(BloodBankShop bbshop) {
	this.bbshop = bbshop;
}
}
