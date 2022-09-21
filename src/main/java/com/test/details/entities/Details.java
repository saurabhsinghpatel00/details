package com.test.details.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class Details {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="contactNumber")
	private int contactNumber;

	
	
	

	public Details(String name, int contactNumber) {
		
		this.name = name;
		this.contactNumber = contactNumber;
	}

	
	

	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + "]";
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	

}
