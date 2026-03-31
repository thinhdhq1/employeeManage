package com.example.terasoluna.app.domain.service;

import com.example.terasoluna.app.domain.model.Employee;
import com.example.terasoluna.app.domain.repository.EmployeeRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeSearchServiceImpl implements EmployeeSearchService {

    private final EmployeeRepository employeeRepository;

    public EmployeeSearchServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeSearchResult search(EmployeeSearchCriteria criteria, int page, int size) {
        int safeSize = Math.max(1, size);
        int safePage = Math.max(1, page);

        int totalCount = employeeRepository.count(criteria);
        int totalPages = Math.max(1, (int) Math.ceil((double) totalCount / safeSize));
        int currentPage = Math.min(safePage, totalPages);
        int offset = (currentPage - 1) * safeSize;
        List<Employee> pageItems = employeeRepository.search(criteria, offset, safeSize);

        return new EmployeeSearchResult(pageItems, totalCount, currentPage, totalPages, safeSize);
    }
}
