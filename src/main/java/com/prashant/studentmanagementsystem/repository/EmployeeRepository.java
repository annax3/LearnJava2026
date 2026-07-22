package com.prashant.studentmanagementsystem.repository;

import com.prashant.studentmanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
