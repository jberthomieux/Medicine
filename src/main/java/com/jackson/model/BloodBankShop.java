package com.jackson.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BloodBankShop {
	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private int bbId;
	    @Column
	    private String bbName;
	    @Column
	    private String bbAddress;
	    @Column
	    private String bbNumber;
	    @Column
	    private boolean bb24h;
	    @Column
	    private String bbcity;
	    @Column
	    private String bbarea;
	   // private User blooduser;
		public BloodBankShop(int bbId, String bbName, String bbAddress, String bbNumber, boolean bb24h, String bbcity,
				String bbarea) {
			super();
			this.bbId = bbId;
			this.bbName = bbName;
			this.bbAddress = bbAddress;
			this.bbNumber = bbNumber;
			this.bb24h = bb24h;
			this.bbcity = bbcity;
			this.bbarea = bbarea;
		}
	public BloodBankShop() {
		super();
	}
	public int getBbId() {
		return bbId;
	}
	public void setBbId(int bbId) {
		this.bbId = bbId;
	}
	public String getBbName() {
		return bbName;
	}
	public void setBbName(String bbName) {
		this.bbName = bbName;
	}
	public String getBbAddress() {
		return bbAddress;
	}
	public void setBbAddress(String bbAddress) {
		this.bbAddress = bbAddress;
	}
	public String getBbNumber() {
		return bbNumber;
	}
	public void setBbNumber(String bbNumber) {
		this.bbNumber = bbNumber;
	}
	public boolean isBb24h() {
		return bb24h;
	}
	public void setBb24h(boolean bb24h) {
		this.bb24h = bb24h;
	}
	public String getBbcity() {
		return bbcity;
	}
	public void setBbcity(String bbcity) {
		this.bbcity = bbcity;
	}
	public String getBbarea() {
		return bbarea;
	}
	public void setBbarea(String bbarea) {
		this.bbarea = bbarea;
	}
	@Override
	public String toString() {
		return "BloodBankShop [bbId=" + bbId + ", bbName=" + bbName + ", bbAddress=" + bbAddress + ", bbNumber="
				+ bbNumber + ", bb24h=" + bb24h + ", bbcity=" + bbcity + ", bbarea=" + bbarea + "]";
	}
	    
	    
}
