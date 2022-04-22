package com.spring.S402.n.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employees {

	private List<Employee> empList;

	public List<Employee> getEmpList() {
		if (empList == null) {
			empList = new ArrayList<>();
		}
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

}
