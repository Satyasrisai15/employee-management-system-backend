package com.employee_management_tool.employee_management_system_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee_management_tool.employee_management_system_backend.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Basic CRUD operations are automatically provided by JpaRepository:
    // - save(Employee entity)
    // - findById(Long id)
    // - findAll() 
    // - deleteById(Long id)
    // - count()
    // etc.

    // You can add custom query methods here if needed
    // For example:
    
    // Find employees by department
    // List<Employee> findByDepartment(String department);
    
    // Find employees with salary greater than
    // List<Employee> findBySalaryGreaterThan(BigDecimal salary);
    
    // Find employees by position containing a string (case insensitive)
    // List<Employee> findByPositionContainingIgnoreCase(String position);
}
