package com.michael.employeeservice.Employee;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@AllArgsConstructor

public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    ResponseEntity<Employee> getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(employee);

    }

}
