package com.example.demo.entity;

import java.util.Set;

import javax.persistence.*;

import com.example.demo.dto.FinalData;

@NamedNativeQuery(name = "Images.getInfo",
query = "select  campaginentrys.campaginname,impressions.campagincurrentdate,campaginentrys.campagincategory,campaginentrys.campaginurl , count(*) as  successcampaginviews,campaginentrys.desiredcampaginviews,concat(round(count(*)/(campaginentrys.desiredcampaginviews)*100)) as efficiencystatus  from campaginentrys  inner JOIN impressions on  campaginentrys.campaginid=impressions.campaginid  group by impressions.campagincurrentdate, campaginentrys.campaginid",
resultSetMapping = "Mapping.FinalData")
@SqlResultSetMapping(name = "Mapping.FinalData",classes = @ConstructorResult(targetClass = FinalData.class,columns = {@ColumnResult(name = "campaginname", type = String.class),@ColumnResult(name = "campaginurl", type = String.class),
        @ColumnResult(name = "campagincategory",type = String.class), @ColumnResult(name = "campagincurrentdate", type = String.class), @ColumnResult(name = "successcampaginviews", type = Integer.class),
        @ColumnResult(name = "desiredcampaginviews", type = Integer.class), @ColumnResult(name = "efficiencystatus", type =Integer.class )}))

@Entity
@Table(name="campaginentrys")
public class Images {
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
	public Images(Integer campaginid, String campaginname, String campagincategory, String campaginurl,
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
	public Images() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	 /*@OneToMany(mappedBy = "images", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	    private Set<Impressions> impressions;
	
	public Set<Impressions> getImpressions() {
		return impressions;
	}

	public void setImpressions(Set<Impressions> impressions) {
		this.impressions = impressions;
	}*/



	//@OneToMany(mappedBy = "images", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	    //private Set<Impressions> impressions;
	


	



	

	
	
	
}
	
	
	

	
	
		
	
	
	
	
	


