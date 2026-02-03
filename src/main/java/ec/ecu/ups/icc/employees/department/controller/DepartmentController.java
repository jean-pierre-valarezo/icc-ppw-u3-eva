package ec.ecu.ups.icc.employees.department.controller;


import org.springframework.web.bind.annotation.*;

import ec.ecu.ups.icc.employees.department.employee.entity.Employee;
import ec.ecu.ups.icc.employees.department.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/{id}/employees")
    public List<Employee> getEmployees(
            @PathVariable Long id,
            @RequestParam(defaultValue = "desc") String sort
    ) {
        return service.getEmployees(id, sort);
    }
}
