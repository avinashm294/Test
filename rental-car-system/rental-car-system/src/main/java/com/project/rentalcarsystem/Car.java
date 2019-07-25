package com.project.rentalcarsystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//(strategy = GenerationType.SEQUENCE)
    private Long id;
	private String username;
    private String type;
    private String modelname;
    private String year_of_registration;
    private String seating_capacity;
    private String cost_per_day;
    private String milleage;
    private String pincode;
    private String number;
    private String email;
    private String cost;
    private String year;
    
    	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	
	public String getYear_of_registration() {
		return year_of_registration;
	}

	public void setYear_of_registration(String year_of_registration) {
		this.year_of_registration = year_of_registration;
	}

	public String getseating_capacity() {
		return seating_capacity;
	}

	public void setSeating_capacity(String seating_capacity) {
		this.seating_capacity = seating_capacity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public String getCost_per_day() {
		return cost_per_day;
	}

	public void setCost_per_day(String cost_per_day) {
		this.cost_per_day = cost_per_day;
	}

	
	public String getMilleage() {
		return milleage;
	}

	public void setMilleage(String milleage) {
		this.milleage = milleage;
	}
	
	
	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Car(String username,String type,String modelname,String year_of_registration,String seating_capacity,String milleage,String email,String number,String pincode,String cost_per_day,String cost,String year) {
		this.username=username;
		this.type = type;
		this.modelname=modelname;
		this.year_of_registration=year_of_registration;
		this.seating_capacity=seating_capacity;
		//this.cost_per_day=cost_per_day;
		this.milleage=milleage;
		this.email=email;
		this.number=number;
		this.pincode=pincode;
		this.cost_per_day=cost_per_day;
		this.cost=cost;
		this.year=year;
	}
		
	/*@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}*/
	
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", username="+ username +",type=" + type + ", modelname=" + modelname + ",year_of_registration="+year_of_registration+",seating_capacity="+seating_capacity+",milleage="+milleage+", email="+ email + ", number=" + number + ", pincode=" + pincode + ",cost_per_day="+cost_per_day+",cost="+cost+",year="+year+"]";
	}
	
	public Car() {
	}
    
}

