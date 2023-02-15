package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="impressions")
public class Impressions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer impressionid;
	private String campagincurrentdate;
	private String campagincurrenttime;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "campaginid", nullable = false)
	 private Images images;

	public Integer getImpressionid() {
		return impressionid;
	}

	public void setImpressionid(Integer impressionid) {
		this.impressionid = impressionid;
	}

	public String getCampagincurrentdate() {
		return campagincurrentdate;
	}

	public void setCampagincurrentdate(String campagincurrentdate) {
		this.campagincurrentdate = campagincurrentdate;
	}

	public String getCampagincurrenttime() {
		return campagincurrenttime;
	}

	public void setCampagincurrenttime(String campagincurrenttime) {
		this.campagincurrenttime = campagincurrenttime;
	}

	public Images getImages() {
		return images;
	}

	public void setImages(Images images) {
		this.images = images;
	}

	public Impressions(Integer impressionid, String campagincurrentdate, String campagincurrenttime, Images images) {
		super();
		this.impressionid = impressionid;
		this.campagincurrentdate = campagincurrentdate;
		this.campagincurrenttime = campagincurrenttime;
		this.images = images;
	}

	public Impressions() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

   

	
	
	

	
	
	
	
	

}
