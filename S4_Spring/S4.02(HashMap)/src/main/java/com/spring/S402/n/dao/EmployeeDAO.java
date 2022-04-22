package com.spring.S402.n.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.spring.S402.n.exception.EmptyInputObjectException;
//import com.spring.S402.n.exception.EmptyInputStringException;
import com.spring.S402.n.exception.EmptyListException;
import com.spring.S402.n.exception.NoEmployeeByPositionException;
import com.spring.S402.n.model.Employee;
//import com.spring.S402.n.model.Employees;

@Repository
public class EmployeeDAO {

	private static final Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	static {
		initEmps();
	}

	private static void initEmps() {
		Employee emp1 = new Employee(1, "Lopez", "Administrative");
		emp1.getEmpSalary(emp1.getEmpPosition());

		Employee emp2 = new Employee(2, "Vilaseca", "Salesman");
		emp2.getEmpSalary(emp2.getEmpPosition());

		Employee emp3 = new Employee(3, "Agramunt", "Manager");
		emp3.getEmpSalary(emp3.getEmpPosition());

		empMap.put(emp1.getEmpNo(), emp1);
		empMap.put(emp2.getEmpNo(), emp2);
		empMap.put(emp3.getEmpNo(), emp3);

	}

	public List<Employee> getAllEmployees() {

		Collection<Employee> c = empMap.values();
		List<Employee> empList = new ArrayList<Employee>();
		empList.addAll(c);

		if (empMap.isEmpty()) {
			throw new EmptyListException();
		}
		return empList;
	}

	public Employee getEmployee(int empNo) {
		// En cas de posar un Id que no existeix a la
		// Base de dades tornarà missatge corresponent,
		// en aquest cas seria el mateix missatge que he afegit al
		// ControllerExceptionHandler per IndexOutOfBoundsException:
		// "No existeix cap treballador amb aquest empNo, torna a provar."

		Employee employee = empMap.get(empNo);
		if (employee == null) {
			throw new IndexOutOfBoundsException();
		}
		return empMap.get(empNo);
	}

	public List<Employee> getEmployeeByPosition(String empPosition) throws NoEmployeeByPositionException {

		// En aquest cas he fet servir una Lambda perque no me´n sortia per fer-ho amb
		// un enfoc semblant a com ho he fet per "getEmployee",
		// i vaig trobar un exemple semblant que em podia ajudar a fer-ho d´aquesta
		// manera.

		Collection<Employee> c = empMap.values();
		List<Employee> empList = new ArrayList<Employee>();
		empList.addAll(c);

		List<Employee> listByPosition = empList.stream()
				.filter(employee -> employee.getEmpPosition().equalsIgnoreCase(empPosition))
				.collect(Collectors.toList());

		if (listByPosition.isEmpty()) {
			throw new NoEmployeeByPositionException();
		}
		return listByPosition;
	}

	public Employee addEmployee(Employee newEmployee) {

		int empNo = empMap.size() + 1;
		newEmployee.setEmpNo(empNo);
		String empPosition = newEmployee.getEmpPosition();
		newEmployee.getEmpSalary(empPosition);

//		if(employee.getEmpName().isEmpty() || employee.getEmpPosition().isEmpty())) {
//		throw new EmptyInputStringException();
//	}

		if (newEmployee.getEmpName().isEmpty() || newEmployee.getEmpPosition().isEmpty()) {
			throw new EmptyInputObjectException();
		}

		empMap.put(newEmployee.getEmpNo(), newEmployee);
		return newEmployee;

	}

	public Employee updateEmployee(Employee employee, int empNo) {

		if (employee.getEmpName().isEmpty() || employee.getEmpPosition().isEmpty()) {
			throw new EmptyInputObjectException();
		}
		empMap.remove(empNo);
		employee.setEmpNo(empNo);
		String empPosition = employee.getEmpPosition();
		employee.getEmpSalary(empPosition);

		empMap.put(employee.getEmpNo(), employee);
		return employee;
	}

	public Employee deleteEmployee(int empNo) {

		Employee employee = empMap.get(empNo);
		if (employee == null) {
			throw new IndexOutOfBoundsException();
		}

		empMap.remove(empNo);

		return employee;
	}

}
