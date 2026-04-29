package com.example.demo.service;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {

	private final EmployeeRepo employeeRepo;

	public EmployeeService(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	public Employee findEmployeeById(Long id) {

		return employeeRepo.findById(id)
				.orElseThrow(() -> new UserNotFoundException("Emp with id " + id + " not found"));
	}

}
