package com.example.terasoluna.app.domain.model;

public class Employee {

	private Integer employeeId;
	private String name;
	private int age;
	private String birth;
	private String address;
	private String phoneNumber;

	public Employee() {
	}

	public Employee(Integer employeeId, String name, int age, String birth, String address, String phoneNumber) {
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
