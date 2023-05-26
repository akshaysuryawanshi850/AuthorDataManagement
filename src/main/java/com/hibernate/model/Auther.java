package com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BookAuther")

public class Auther
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private int  price;
	private String book;
	private String gender;
	public Auther() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Auther(int id, String name, String email, int price, String book, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.price = price;
		this.book = book;
		this.gender = gender;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Auther [id=" + id + ", name=" + name + ", email=" + email + ", price=" + price + ", book=" + book
				+ ", gender=" + gender + "]";
	}
}
