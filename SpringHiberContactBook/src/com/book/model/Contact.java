package com.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT_BOOK")
public class Contact {
	@Id
	@Column(name ="ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CON_SEQ")
    @SequenceGenerator(sequenceName = "CONTACT_SEQ", allocationSize = 1, name = "CON_SEQ")
	private int id;
	
	@Column(name ="NAME")
	private String name;
	
	@Column(name ="EMAIL")
	private String email;
	
	@Column(name ="ADDRESS")
	private String address;
	
	@Column(name ="PHONE")
	private String phone;
	
	public Contact(int id, String name, String email, String address, String phone) {
		super();
		System.out.println("Invoking Contact Constructor ....");
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	public Contact() {
		//System.out.println("Invoking Contact default Constructor ....");
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
