package com.employeeportal.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeportal.domain.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
