package com.coforge.dms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.coforge.dms.model.Department;
import com.coforge.dms.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	public Department addDepartment(@Valid @RequestBody Department department) {
		return departmentService.addDepartment(department);
	}

	@GetMapping
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	@GetMapping("/{departmentId}")
	public Department getDepartmentById(@PathVariable int departmentId) {
		return departmentService.getDepartmentById(departmentId);
	}

	@GetMapping("/name/{departmentName}")
	public Department getDepartmentByName(@PathVariable String departmentName) {
		return departmentService.getDepartmentByName(departmentName);
	}

	@PutMapping("/{departmentId}")
	public Department updateDepartment(@PathVariable int departmentId,
			@Valid @RequestBody Department department) {

		return departmentService.updateDepartment(departmentId, department);
	}

	@DeleteMapping("/{departmentId}")
	public String deleteDepartmentById(@PathVariable int departmentId) {

		departmentService.deleteDepartmentById(departmentId);
		return "Department deleted successfully.";
	}

	@DeleteMapping("/name/{departmentName}")
	public String deleteDepartmentByName(@PathVariable String departmentName) {

		departmentService.deleteDepartmentByName(departmentName);
		return "Department deleted successfully.";
	}

	@GetMapping("/count")
	public long countDepartments() {
		return departmentService.countDepartments();
	}
}