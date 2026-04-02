package com.example.terasoluna.app.domain.model;

public class Employee {

	private String employeeId;
	private String name;
	private int age;
	private String birthday;
	private String address;
	private String phone;

	public Employee() {
	}

	public Employee(String employeeId, String name, int age, String birthday, String address, String phone) {
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.address = address;
		this.phone = phone;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
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
