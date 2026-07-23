package com.coforge.dms.service;

import java.util.List;

import com.coforge.dms.model.Department;

public interface DepartmentService {

	Department addDepartment(Department department);

	List<Department> getAllDepartments();

	Department getDepartmentById(int departmentId);

	Department getDepartmentByName(String departmentName);

	Department updateDepartment(int departmentId, Department department);

	void deleteDepartmentById(int departmentId);

	void deleteDepartmentByName(String departmentName);

	long countDepartments();

}