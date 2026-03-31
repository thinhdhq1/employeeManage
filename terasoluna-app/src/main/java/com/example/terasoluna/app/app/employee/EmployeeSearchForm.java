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

    @Size(max = 30, message = "{employee.search.birthday.max}")
    private String birthday;

    @Size(max = 200, message = "{employee.search.address.max}")
    private String address;

    @Size(max = 20, message = "{employee.search.phone.max}")
    @Pattern(regexp = "^$|^[0-9-]+$", message = "{employee.search.phone.format}")
    private String phone;

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
