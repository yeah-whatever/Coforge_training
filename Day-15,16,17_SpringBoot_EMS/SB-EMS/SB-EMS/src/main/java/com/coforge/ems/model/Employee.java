package com.coforge.ems.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

/*
 * @Entity - Marks this class as a JPA entity (database table).
 * @Table - Maps this entity to the specified database table.
 */
@Entity
@Table(name = "tbl_employee")
public class Employee {

	/*
	 * @Id - Specifies the primary key.
	 * @Column - Maps the field to a database column.
	 * @NotNull - Ensures the value is not null.
	 */
	@Id
	@Column(name = "eid", length = 4)
	@NotNull
	private int eid;

	/*
	 * @NotBlank - Name cannot be null, empty or only spaces.
	 */
	@Column(name = "ename", length = 10)
	@NotBlank
	private String ename;

	/*
	 * @Positive - Salary must be greater than zero.
	 */
	@Column(name = "esalary", length = 5)
	@Positive
	private int esalary;

	/*
	 * @Positive - Department number must be greater than zero.
	 */
	@Column(name = "dno", length = 3)
	@Positive
	private int dno;

	// Default constructor
	public Employee() {
		super();
	}

	// Parameterized constructor
	public Employee(int eid, String ename, int esalary, int dno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.dno = dno;
	}

	// Getter and Setter for eid
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	// Getter and Setter for ename
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	// Getter and Setter for esalary
	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	// Getter and Setter for dno
	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	// Returns Employee object as a readable String
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", dno=" + dno + "]";
	}

}