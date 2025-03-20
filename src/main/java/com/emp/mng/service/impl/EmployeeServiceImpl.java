package com.emp.mng.service.impl;

import com.emp.mng.dto.EmployeeDto;
import com.emp.mng.entity.Employee;
import com.emp.mng.mapper.EmployeeMapper;
import com.emp.mng.repository.EmployeeRepository;
import com.emp.mng.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }


}
