package com.spring.S402.n.controller;

import java.util.List;
//import java.io.IOException;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.server.ResponseStatusException;
//import org.springframework.web.server.ServerWebExchange;
//import org.springframework.web.server.WebFilterChain;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//import com.fasterxml.classmate.Filter;
//import com.spring.S402.n.exception.EmptyInputObjectException;
//import com.spring.S402.n.payload.UploadFileResponse;
//import com.spring.S402.n.repository.EmployeeRepository;
//import com.spring.S402.n.service.FileStorageService;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.S402.n.dao.EmployeeDAO;
import com.spring.S402.n.exception.NoEmployeeByPositionException;
import com.spring.S402.n.model.Employee;
//import com.spring.S402.n.model.Employees;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeDAO employeeDAO;
	
//	@Autowired
//	private EmployeeRepository employeeRepository;
	
	//Nivell 3 (afegir capçalera a la resposta de tots els endpoints)
	@ModelAttribute
    public void setResponseHeader(HttpServletResponse response) {
        response.setHeader("IT-Academy-Exercise", "Simple-Service");
    }
	
	@GetMapping("/")
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}
	
//	@GetMapping("/employees")
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//	}

	@GetMapping("/employee/{empNo}")
	public Employee getEmployee(@PathVariable("empNo") int empNo) {
		return employeeDAO.getEmployee(empNo);

	}
	
	@GetMapping("/employee/position/{empPosition}")
	public List<Employee> getEmployeeByPosition(@PathVariable("empPosition") String empPosition, Employee employee) throws NoEmployeeByPositionException {
		return employeeDAO.getEmployeeByPosition(empPosition);
	}

	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee newEmployee) {

//		System.out.println("Creating employee: " + newEmployee.getEmpNo());
		return employeeDAO.addEmployee(newEmployee);
	}

	@PutMapping("/employee/{empNo}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int empNo) {

		System.out.println("Updating employee: " + empNo);
		return employeeDAO.updateEmployee(employee, empNo);
	}

	@DeleteMapping("/employee/{empNo}")
	public Employee removeEmployee(@PathVariable("empNo") int empNo) {

		return employeeDAO.deleteEmployee(empNo);
	}
}
