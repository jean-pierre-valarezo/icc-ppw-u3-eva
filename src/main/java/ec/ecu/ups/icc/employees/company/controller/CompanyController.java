package ec.ecu.ups.icc.employees.company.controller;


import org.springframework.web.bind.annotation.*;

import ec.ecu.ups.icc.employees.company.dto.CompanyDepartmentsDto;
import ec.ecu.ups.icc.employees.company.service.CompanyService;
import ec.ecu.ups.icc.employees.department.employee.dto.EmployeesResponseDto;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyService service;

    public CompanyController(CompanyService service) {
        this.service = service;
    }

    @GetMapping("/{id}/departments")
    public CompanyDepartmentsDto departments(@PathVariable Long id) {
        return service.getCompanyDepartments(id);
    }

    @GetMapping("/{id}/high-salary-employees")
    public EmployeesResponseDto highSalary(
            @PathVariable Long id,
            @RequestParam(required = false) Double minSalary) 
            {
        return service.getHighSalaryEmployees(id, minSalary);
    }
}
