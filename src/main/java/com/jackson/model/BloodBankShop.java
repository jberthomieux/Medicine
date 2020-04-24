package com.jackson.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.jackson.model.BloodBank;

@Entity
@Table(name="bloodbankshop")
public class BloodBankShop {
	    @Id
	    @Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY )
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
	  

     
//	    @OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
//		@JoinTable(name="BLOODBANKSHOP_BLOODBANK",joinColumns= {
//		@JoinColumn(name="BLOODBANKSHOP_BBID")},inverseJoinColumns= {
//   	    @JoinColumn(name="BLOODBANK_ID")})
	    //@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	    @OneToMany(targetEntity = BloodBank.class, cascade = CascadeType.ALL)
	    @JoinColumn(name="bbshop_fk", referencedColumnName = "id")
	    private List<BloodBank> bloodbanks;

		

		public BloodBankShop() {
			super();
		}

		public BloodBankShop(int bbId, String bbName, String bbAddress, String bbNumber, boolean bb24h, String bbcity,
				String bbarea, List<BloodBank> bloodbanks) {
			super();
			this.bbId = bbId;
			this.bbName = bbName;
			this.bbAddress = bbAddress;
			this.bbNumber = bbNumber;
			this.bb24h = bb24h;
			this.bbcity = bbcity;
			this.bbarea = bbarea;
			this.bloodbanks = bloodbanks;
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

		

		public List<BloodBank> getBloodbanks() {
			return bloodbanks;
		}

	public void setBloodbanks(List<BloodBank> bloodbanks) {
			this.bloodbanks = bloodbanks;
		}

	@Override
	public String toString() {
		return "BloodBankShop [bbId=" + bbId + ", bbName=" + bbName + ", bbAddress=" + bbAddress + ", bbNumber="
				+ bbNumber + ", bb24h=" + bb24h + ", bbcity=" + bbcity + ", bbarea=" + bbarea + ", bloodbanks="
				+ bloodbanks + "]";
	}
		
	    
}
