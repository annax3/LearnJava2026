package com.prashant.studentmanagementsystem.service.impl;

import com.prashant.studentmanagementsystem.dto.Employeedto;
import com.prashant.studentmanagementsystem.entity.Employee;
import com.prashant.studentmanagementsystem.mapper.EmployeeMapper;
import com.prashant.studentmanagementsystem.repository.EmployeeRepository;
import com.prashant.studentmanagementsystem.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public Employeedto createEmployee(Employeedto employeedto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeedto);
        Employee SavedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(SavedEmployee);
    }
}
