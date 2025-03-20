package com.emp.mng.mapper;

import com.emp.mng.dto.EmployeeDto;
import com.emp.mng.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(employee.getId(), employee.getFirstName(),
                employee.getLastName(), employee.getEmail());
    }

    public static Employee mapToEmployee(EmployeeDto employee){
        return new Employee(employee.getId(), employee.getFirstName(),
                employee.getLastName(), employee.getEmail());
    }

}
