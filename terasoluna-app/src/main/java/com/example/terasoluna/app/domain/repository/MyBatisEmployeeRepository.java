package com.example.terasoluna.app.domain.repository;

import com.example.terasoluna.app.domain.model.Employee;
import com.example.terasoluna.app.domain.service.EmployeeSearchCriteria;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MyBatisEmployeeRepository implements EmployeeRepository {

    private final EmployeeMapper employeeMapper;

    public MyBatisEmployeeRepository(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<Employee> search(EmployeeSearchCriteria criteria, int offset, int limit) {
        return employeeMapper.search(criteria, offset, limit);
    }

    @Override
    public int count(EmployeeSearchCriteria criteria) {
        return employeeMapper.count(criteria);
    }
}
