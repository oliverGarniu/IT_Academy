package com.spring.S402.n.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {

	private int empNo;
	private String empName;
	private String empPosition;
	private float empSalary;
	private final float ADMINSALARY = 20000f;
	private final float SALESMANSALARY = 45000f;
	private final float MANAGERSALARY = 90000f;

	public Employee() {

	}
	public Employee(int empNo) {
		this.empNo = empNo;
	}
	
	public Employee(String empName, String empPosition) {
		this.empName = empName;
		this.empPosition = empPosition;
	}

	public Employee(int empNo, String empName, String empPosition) {
		this.empNo = empNo;
		this.empName = empName;
		this.empPosition = empPosition;
	}

	public Employee(int empNo, String empName, String empPosition, float empSalary) {
		this.empNo = empNo;
		this.empName = empName;
		this.empPosition = empPosition;
		this.empSalary = empSalary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPosition() {
		return empPosition;
	}

	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public double getEmpSalary(String empPosition) {

		if (empPosition.equalsIgnoreCase("Administrative")) {
			empSalary = ADMINSALARY;
		} else if (empPosition.equalsIgnoreCase("Salesman")) {
			empSalary = SALESMANSALARY;
		} else if (empPosition.equalsIgnoreCase("Manager")) {
			empSalary = MANAGERSALARY;
		}
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empPosition=" + empPosition + ", empSalary="
				+ empSalary + "]";
	}

}
