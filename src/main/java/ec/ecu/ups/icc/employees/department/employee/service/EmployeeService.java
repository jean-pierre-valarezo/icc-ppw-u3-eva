package ec.ecu.ups.icc.employees.department.employee.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.ecu.ups.icc.employees.department.employee.dto.EmployeeTransferResponseDto;
import ec.ecu.ups.icc.employees.department.employee.entity.Employee;
import ec.ecu.ups.icc.employees.department.employee.repository.EmployeeRepository;
import ec.ecu.ups.icc.employees.department.entity.Department;
import ec.ecu.ups.icc.employees.department.repository.DepartmentRepository;
import ec.ecu.ups.icc.employees.exceptions.ConflictException;
import ec.ecu.ups.icc.employees.exceptions.NotFoundException;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepo;
    private final DepartmentRepository departmentRepo;

    public EmployeeService(EmployeeRepository e, DepartmentRepository d) {
        this.employeeRepo = e;
        this.departmentRepo = d;
    }

    @Transactional
    public EmployeeTransferResponseDto transfer(Long employeeId, Long newDeptId) {

        Employee emp = employeeRepo.findByIdAndActive(employeeId, 'S')
                .orElseThrow(() -> new NotFoundException("Employee not found or inactive"));

        Department newDept = departmentRepo.findByIdAndActive(newDeptId, 'S')
                .orElseThrow(() -> new NotFoundException("Target department not found or inactive"));

        

        return null;

        
    }
}
