package com.rk.bb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus_table")
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bus_id;
	private String bus_number;
	private String model;
	private int capacity;
	private int year_of_manufacture;
	private String bus_type;
	private String amenities;
	private String status;

	public Long getBus_id() {
		return bus_id;
	}

	public void setBus_id(Long bus_id) {
		this.bus_id = bus_id;
	}

	public String getBus_number() {
		return bus_number;
	}

	public void setBus_number(String bus_number) {
		this.bus_number = bus_number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getYear_of_manufacture() {
		return year_of_manufacture;
	}

	public void setYear_of_manufacture(int year_of_manufacture) {
		this.year_of_manufacture = year_of_manufacture;
	}

	public String getBus_type() {
		return bus_type;
	}

	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
