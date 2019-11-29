package com.employeeportal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeportal.domain.EmployeeEntity;

@Service
public class EmployeeServices {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void registerService(EmployeeEntity e) {
		System.out.println("Inside registerService");
		employeeRepository.save(e);
	}
	
	public List<EmployeeEntity> getAllEmployee() {
		System.out.println("Inside getAllEmployee");
		return employeeRepository.findAll();
	}
	
	public Optional<EmployeeEntity> getEmployeeById(int empId) {
		System.out.println("Inside getAllEmployee");
		return employeeRepository.findById(empId);
	}
}
