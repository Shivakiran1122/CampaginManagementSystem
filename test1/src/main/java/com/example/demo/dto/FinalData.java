package com.example.demo.dto;

public class FinalData {
	private String campaginname;
	private String campaginurl;
	private String campagincategory;
	private String campagincurrentdate;
    private int successcampaginviews;
    private int desiredcampaginviews;
    private int efficiencystatus;
    
    
	public String getCampaginname() {
		return campaginname;
	}
	public void setCampaginname(String campaginname) {
		this.campaginname = campaginname;
	}
	public String getCampaginurl() {
		return campaginurl;
	}
	public void setCampaginurl(String campaginurl) {
		this.campaginurl = campaginurl;
	}
	public String getCampagincategory() {
		return campagincategory;
	}
	public void setCampagincategory(String campagincategory) {
		this.campagincategory = campagincategory;
	}
	public String getCampagincurrentdate() {
		return campagincurrentdate;
	}
	public void setCampagincurrentdate(String campagincurrentdate) {
		this.campagincurrentdate = campagincurrentdate;
	}
	public int getSuccesscampaginviews() {
		return successcampaginviews;
	}
	public void setSuccesscampaginviews(int successcampaginviews) {
		this.successcampaginviews = successcampaginviews;
	}
	public int getDesiredcampaginviews() {
		return desiredcampaginviews;
	}
	public void setDesiredcampaginviews(int desiredcampaginviews) {
		this.desiredcampaginviews = desiredcampaginviews;
	}
	
	
	public int getEfficiencystatus() {
		return efficiencystatus;
	}
	public void setEfficiencystatus(int efficiencystatus) {
		this.efficiencystatus = efficiencystatus;
	}
	
	public FinalData(String campaginname, String campaginurl, String campagincategory, String campagincurrentdate,
			int successcampaginviews, int desiredcampaginviews, int efficiencystatus) {
		super();
		this.campaginname = campaginname;
		this.campaginurl = campaginurl;
		this.campagincategory = campagincategory;
		this.campagincurrentdate = campagincurrentdate;
		this.successcampaginviews = successcampaginviews;
		this.desiredcampaginviews = desiredcampaginviews;
		this.efficiencystatus = efficiencystatus;
	}
	public FinalData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    
	
  

}
