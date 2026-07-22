package com.prashant.studentmanagementsystem.mapper;

import com.prashant.studentmanagementsystem.dto.Employeedto;
import com.prashant.studentmanagementsystem.entity.Employee;

public class EmployeeMapper {
    //convert into employee entity to EmployeeDto
    public  static Employeedto mapToEmployeeDto(Employee employee){
        return  new Employeedto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getCreatedAt(),
                employee.getUpdatedAt()
        );
    }

    //convert into employeeDto to Employee entity
    public  static Employee mapToEmployee(Employeedto employeeDto){
        return  new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getCreatedAt(),
                employeeDto.getUpdatedAt()
        );
    }


}
