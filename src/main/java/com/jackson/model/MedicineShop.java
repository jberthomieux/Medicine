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
import javax.persistence.OneToMany;
import com.jackson.model.Medicine;


@Entity
public class MedicineShop {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int medId;
    @Column
    private String medshopName;
    @Column
    private String medshopAddress;
    @Column
    private String medshopNumber;
    @Column
    private boolean med24h;
    @Column
    private String medcity;
    @Column
    private String medarea;
    
    @OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="MEDICINESHOP_MEDICINE",joinColumns= {
	@JoinColumn(name="MEDICINESHOP_MEDID")},inverseJoinColumns= {
	@JoinColumn(name="MEDICINE_ID")})
    List<Medicine> medicines;
	
	public MedicineShop(int medId, String medshopName, String medshopAddress, String medshopNumber, boolean med24h,
			String medcity, String medarea, List<Medicine> medicines) {
		super();
		this.medId = medId;
		this.medshopName = medshopName;
		this.medshopAddress = medshopAddress;
		this.medshopNumber = medshopNumber;
		this.med24h = med24h;
		this.medcity = medcity;
		this.medarea = medarea;
		this.medicines = medicines;
	}
	public List<Medicine> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}
	public MedicineShop() {
		super();
	}
	public int getMedId() {
		return medId;
	}
	public void setMedId(int medId) {
		this.medId = medId;
	}
	public String getMedshopName() {
		return medshopName;
	}
	public void setMedshopName(String medshopName) {
		this.medshopName = medshopName;
	}
	public String getMedshopAddress() {
		return medshopAddress;
	}
	public void setMedshopAddress(String medshopAddress) {
		this.medshopAddress = medshopAddress;
	}
	public String getMedshopNumber() {
		return medshopNumber;
	}
	public void setMedshopNumber(String medshopNumber) {
		this.medshopNumber = medshopNumber;
	}
	public boolean isMed24h() {
		return med24h;
	}
	public void setMed24h(boolean med24h) {
		this.med24h = med24h;
	}
	public String getMedcity() {
		return medcity;
	}
	public void setMedcity(String medcity) {
		this.medcity = medcity;
	}
	public String getMedarea() {
		return medarea;
	}
	public void setMedarea(String medarea) {
		this.medarea = medarea;
	}
	@Override
	public String toString() {
		return "MedicineShop [medId=" + medId + ", medshopName=" + medshopName + ", medshopAddress=" + medshopAddress
				+ ", medshopNumber=" + medshopNumber + ", med24h=" + med24h + ", medcity=" + medcity + ", medarea="
				+ medarea + "]";
	}
  
	
}
