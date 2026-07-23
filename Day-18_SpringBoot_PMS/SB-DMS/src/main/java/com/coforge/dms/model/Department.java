package com.coforge.dms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "department")
public class Department {

	@Id
	private int departmentId;

	@NotBlank(message = "Department Name cannot be empty")
	private String departmentName;

	public Department() {
	}

	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId +
				", departmentName=" + departmentName + "]";
	}
}