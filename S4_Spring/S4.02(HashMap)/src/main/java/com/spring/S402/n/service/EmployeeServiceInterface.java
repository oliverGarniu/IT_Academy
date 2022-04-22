package com.spring.S402.n.service;

import com.spring.S402.n.model.Employee;
import com.spring.S402.n.model.Employees;

public interface EmployeeServiceInterface {

	public Employees getAllEmployees();

	public Employee getEmployee(int empNo);

	public Employee getEmployeeByPosition();

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee, int empNo);

	public Employee deleteEmployee(int empNo);

}
