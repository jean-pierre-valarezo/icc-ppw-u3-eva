package ec.ecu.ups.icc.employees.company.service;


import org.springframework.stereotype.Service;

import ec.ecu.ups.icc.employees.company.dto.CompanyDepartmentsDto;
import ec.ecu.ups.icc.employees.company.entity.Company;
import ec.ecu.ups.icc.employees.company.repository.CompanyRepository;
import ec.ecu.ups.icc.employees.department.dto.DepartmentMiniDto;
import ec.ecu.ups.icc.employees.department.dto.DepartmentSummaryDto;
import ec.ecu.ups.icc.employees.department.employee.dto.EmployeeWithDepartmentDto;
import ec.ecu.ups.icc.employees.department.employee.dto.EmployeesResponseDto;
import ec.ecu.ups.icc.employees.department.employee.entity.Employee;
import ec.ecu.ups.icc.employees.department.employee.repository.EmployeeRepository;
import ec.ecu.ups.icc.employees.department.entity.Department;
import ec.ecu.ups.icc.employees.department.repository.DepartmentRepository;
import ec.ecu.ups.icc.employees.exceptions.NotFoundException;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepo;
    private final DepartmentRepository departmentRepo;
    private final EmployeeRepository employeeRepo;

    public CompanyService(
            CompanyRepository companyRepo,
            DepartmentRepository departmentRepo,
            EmployeeRepository employeeRepo
    ) {
        this.companyRepo = companyRepo;
        this.departmentRepo = departmentRepo;
        this.employeeRepo = employeeRepo;
    }

   
    public CompanyDepartmentsDto getCompanyDepartments(Long companyId) {

        Company company = companyRepo.findByIdAndActive(companyId, 'S')
                .orElseThrow(() -> new NotFoundException("Company not found or inactive"));

        List<Department> departments =
                departmentRepo.findByCompanyIdAndActive(companyId, 'S');

        CompanyDepartmentsDto dto = new CompanyDepartmentsDto();
        dto.setCompanyId(company.getId());
        dto.setCompanyName(company.getName());
        dto.setCountry(company.getCountry());

        double totalBudget = 0;

        for (Department d : departments) {
            int count =
                    employeeRepo.countByDepartmentIdAndActive(d.getId(), 'S');

            dto.getDepartments().add(
                    new DepartmentSummaryDto(
                            d.getId(),
                            d.getName(),
                            d.getBudget(),
                            count
                    )
            );

            totalBudget += d.getBudget().doubleValue();
        }

        dto.setDepartmentCount(dto.getDepartments().size());
        dto.setTotalBudget(totalBudget);

        return dto;
    }

    public EmployeesResponseDto getHighSalaryEmployees(Long companyId, Double minSalary) {

        Company company = companyRepo.findByIdAndActive(companyId, 'S')
                .orElseThrow(() -> new NotFoundException("Company not found or inactive"));

        double min = (minSalary == null) ? 5000.00 : minSalary;

        List<Employee> employees =
                employeeRepo.findHighSalary(companyId, min);

        EmployeesResponseDto dto = new EmployeesResponseDto();
        dto.setCompanyName(company.getName());
        dto.setMinSalary(min);

        for (Employee e : employees) {
            dto.getEmployees().add(
                    new EmployeeWithDepartmentDto(
                            e.getId(),
                            e.getFirstName(),
                            e.getLastName(),
                            e.getEmail(),
                            e.getSalary(),
                            new DepartmentMiniDto(
                                    e.getDepartmentMiniDto().getId(),
                                    e.getDepartmentMiniDto().getName()
                            )
                    )
            );
        }

        dto.setCount(dto.getEmployees().size());
        return dto;
    }
}
