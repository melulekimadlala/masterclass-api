package com.mm.masterclassapi.service;

import com.mm.masterclassapi.model.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> fetchDepartmentList();
    Department fetchDepartmentById(Long departmentId);
}
