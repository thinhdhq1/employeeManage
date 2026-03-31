package com.example.terasoluna.app.domain.repository;

import com.example.terasoluna.app.domain.model.Employee;
import com.example.terasoluna.app.domain.service.EmployeeSearchCriteria;
import java.util.List;

public interface EmployeeRepository {

    List<Employee> search(EmployeeSearchCriteria criteria, int offset, int limit);

    int count(EmployeeSearchCriteria criteria);
}
