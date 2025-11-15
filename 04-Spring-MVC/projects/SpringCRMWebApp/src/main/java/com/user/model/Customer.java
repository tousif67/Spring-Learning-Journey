package com.user.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String city;
	private String firstName;
	private String lastName;
	public Customer( String city, String firstName, String lastName) {
		super();
		this.city = city;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", city=" + city + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	
	

}
