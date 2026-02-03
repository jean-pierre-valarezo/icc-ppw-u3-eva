package ec.ecu.ups.icc.employees.department.service;


import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ec.ecu.ups.icc.employees.department.employee.entity.Employee;
import ec.ecu.ups.icc.employees.department.employee.repository.EmployeeRepository;
import ec.ecu.ups.icc.employees.department.entity.Department;
import ec.ecu.ups.icc.employees.department.repository.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepo;
    private final EmployeeRepository employeeRepo;

    public DepartmentService(DepartmentRepository d, EmployeeRepository e) {
        this.departmentRepo = d;
        this.employeeRepo = e;
    }

    public List<Employee> getEmployees(Long deptId, String sort) {
        Department dept = departmentRepo.findByIdAndActive(deptId, 'S')
                .orElseThrow(() -> new RuntimeException("Department not found or inactive"));

        Sort.Direction dir = sort.equalsIgnoreCase("asc")
                ? Sort.Direction.ASC : Sort.Direction.DESC;

        return employeeRepo.findByDepartmentIdAndActive(deptId, 'S', Sort.by(dir, "salary"));
    }
}
