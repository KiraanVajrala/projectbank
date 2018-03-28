package com.bellinfo.spring.model;

public class Student {
	String name;
	String password;
	String address;
	String email;

	public Student(String name, String password, String address, String email) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
	}

	public Student() {
		super();
	}

	public Student(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + " ,password:" + password + "]";
	}

}
