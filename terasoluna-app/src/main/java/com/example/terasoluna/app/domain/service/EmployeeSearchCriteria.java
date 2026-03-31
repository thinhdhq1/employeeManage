package com.example.terasoluna.app.domain.service;

public record EmployeeSearchCriteria(
        String employeeId,
        String name,
        Integer age,
        String birthday,
        String address,
        String phone) {
}
