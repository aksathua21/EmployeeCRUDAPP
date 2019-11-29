package com.employeeportal.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employeeportal.domain.EmployeeEntity;
import com.employeeportal.services.EmployeeServices;

@RequestMapping("api/employee")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServices employeeServices;
	
	@CrossOrigin(origins = "*")
	@PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
	public void registerEmployee(@RequestBody EmployeeEntity employeeEntity) {
		System.out.println(employeeEntity.toString());
		employeeServices.registerService(employeeEntity);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/fatch")
	public List<EmployeeEntity> getAllEmployee() {
		List<EmployeeEntity>  employeeList = employeeServices.getAllEmployee();
		Collections.sort(employeeList);
		return employeeList;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/fatch/{empId}", method = RequestMethod.GET)
	public EmployeeEntity getEmployeeById(@PathVariable("empId") int empId) {
		System.out.println("getEmployeeById");
		Optional<EmployeeEntity>  employee = employeeServices.getEmployeeById(empId);
		return employee.get();
	}
}
