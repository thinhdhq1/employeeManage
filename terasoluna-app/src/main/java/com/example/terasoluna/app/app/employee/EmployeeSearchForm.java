package com.example.terasoluna.app.app.employee;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class EmployeeSearchForm {

    @Size(max = 10, message = "{employee.search.employeeId.max}")
    @Pattern(regexp = "^$|^[0-9]+$", message = "{employee.search.employeeId.numeric}")
    private String employeeId;

    @Size(max = 50, message = "{employee.search.name.max}")
    private String name;

    @Min(value = 0, message = "{employee.search.age.min}")
    @Max(value = 120, message = "{employee.search.age.max}")
    private Integer age;

    @Size(max = 10, message = "{employee.search.birth.max}")
    private String birth;

    @Size(max = 100, message = "{employee.search.address.max}")
    private String address;

    @Size(max = 10, message = "{employee.search.phoneNumber.max}")
    @Pattern(regexp = "^$|^[0-9-]+$", message = "{employee.search.phoneNumber.format}")
    private String phoneNumber;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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
