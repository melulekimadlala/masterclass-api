package com.mm.masterclassapi.service.Impl;

import com.mm.masterclassapi.model.Department;
import com.mm.masterclassapi.repository.DepartmentRepository;
import com.mm.masterclassapi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
