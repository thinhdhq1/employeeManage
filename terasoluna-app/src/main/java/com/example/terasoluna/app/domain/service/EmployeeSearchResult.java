package com.example.terasoluna.app.domain.service;

import com.example.terasoluna.app.domain.model.Employee;
import java.util.List;

public record EmployeeSearchResult(
        List<Employee> employees,
        int totalCount,
        int currentPage,
        int totalPages,
        int pageSize) {
}
