package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tempcampaginentrys")
public class TempImages {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer campaginid;
	private String campaginname;
	private String campagincategory;
	private String campaginurl;
	private String Campaginactivedate;
	private String Campaginexpirydate;
	private Integer desiredcampaginviews;
	public Integer getCampaginid() {
		return campaginid;
	}
	public void setCampaginid(Integer campaginid) {
		this.campaginid = campaginid;
	}
	public String getCampaginname() {
		return campaginname;
	}
	public void setCampaginname(String campaginname) {
		this.campaginname = campaginname;
	}
	public String getCampagincategory() {
		return campagincategory;
	}
	public void setCampagincategory(String campagincategory) {
		this.campagincategory = campagincategory;
	}
	public String getCampaginurl() {
		return campaginurl;
	}
	public void setCampaginurl(String campaginurl) {
		this.campaginurl = campaginurl;
	}
	public String getCampaginactivedate() {
		return Campaginactivedate;
	}
	public void setCampaginactivedate(String campaginactivedate) {
		Campaginactivedate = campaginactivedate;
	}
	public String getCampaginexpirydate() {
		return Campaginexpirydate;
	}
	public void setCampaginexpirydate(String campaginexpirydate) {
		Campaginexpirydate = campaginexpirydate;
	}
	public Integer getDesiredcampaginviews() {
		return desiredcampaginviews;
	}
	public void setDesiredcampaginviews(Integer desiredcampaginviews) {
		this.desiredcampaginviews = desiredcampaginviews;
	}
	public TempImages(Integer campaginid, String campaginname, String campagincategory, String campaginurl,
			String campaginactivedate, String campaginexpirydate, Integer desiredcampaginviews) {
		super();
		this.campaginid = campaginid;
		this.campaginname = campaginname;
		this.campagincategory = campagincategory;
		this.campaginurl = campaginurl;
		Campaginactivedate = campaginactivedate;
		Campaginexpirydate = campaginexpirydate;
		this.desiredcampaginviews = desiredcampaginviews;
	}
	public TempImages() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
