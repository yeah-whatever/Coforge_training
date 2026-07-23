package com.coforge.dms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dms.exception.DepartmentNotFoundException;
import com.coforge.dms.model.Department;
import com.coforge.dms.repo.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepo departmentRepo;

	@Override
	public Department addDepartment(Department department) {
		return departmentRepo.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepo.findAll();
	}

	@Override
	public Department getDepartmentById(int departmentId) {

		return departmentRepo.findById(departmentId)
				.orElseThrow(() -> new DepartmentNotFoundException(
						"Department not found with ID : " + departmentId));
	}

	@Override
	public Department getDepartmentByName(String departmentName) {

		return departmentRepo.findByDepartmentName(departmentName)
				.orElseThrow(() -> new DepartmentNotFoundException(
						"Department not found with Name : " + departmentName));
	}

	@Override
	public Department updateDepartment(int departmentId, Department department) {

		Department existingDepartment = departmentRepo.findById(departmentId)
				.orElseThrow(() -> new DepartmentNotFoundException(
						"Department not found with ID : " + departmentId));

		existingDepartment.setDepartmentName(department.getDepartmentName());

		return departmentRepo.save(existingDepartment);
	}

	@Override
	public void deleteDepartmentById(int departmentId) {

		Department department = departmentRepo.findById(departmentId)
				.orElseThrow(() -> new DepartmentNotFoundException(
						"Department not found with ID : " + departmentId));

		departmentRepo.delete(department);
	}

	@Override
	public void deleteDepartmentByName(String departmentName) {

		Department department = departmentRepo.findByDepartmentName(departmentName)
				.orElseThrow(() -> new DepartmentNotFoundException(
						"Department not found with Name : " + departmentName));

		departmentRepo.deleteByDepartmentName(departmentName);
	}

	@Override
	public long countDepartments() {
		return departmentRepo.count();
	}

}