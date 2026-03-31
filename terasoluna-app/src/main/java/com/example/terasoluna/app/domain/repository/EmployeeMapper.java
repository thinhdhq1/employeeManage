package com.example.terasoluna.app.domain.repository;

import com.example.terasoluna.app.domain.model.Employee;
import com.example.terasoluna.app.domain.service.EmployeeSearchCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {

    List<Employee> search(
            @Param("criteria") EmployeeSearchCriteria criteria,
            @Param("offset") int offset,
            @Param("limit") int limit);

    int count(@Param("criteria") EmployeeSearchCriteria criteria);
}
