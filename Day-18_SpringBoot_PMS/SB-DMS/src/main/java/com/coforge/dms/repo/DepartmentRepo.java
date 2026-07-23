package com.coforge.dms.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coforge.dms.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

	Optional<Department> findByDepartmentName(String departmentName);

	void deleteByDepartmentName(String departmentName);

	long count();
}