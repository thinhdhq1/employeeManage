package com.example.terasoluna.app.domain.service;

public interface EmployeeSearchService {

    EmployeeSearchResult search(EmployeeSearchCriteria criteria, int page, int size);
}
