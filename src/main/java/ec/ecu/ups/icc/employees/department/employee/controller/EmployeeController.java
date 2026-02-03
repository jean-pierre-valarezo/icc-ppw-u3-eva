package ec.ecu.ups.icc.employees.department.employee.controller;


import org.springframework.web.bind.annotation.*;

import ec.ecu.ups.icc.employees.department.employee.dto.EmployeeTransferResponseDto;
import ec.ecu.ups.icc.employees.department.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PatchMapping("/{id}/transfer")
    public EmployeeTransferResponseDto transfer(
            @PathVariable Long id,
            @RequestBody EmployeeTransferResponseDto dto
    ) {
        return service.transfer(id, dto.getNewDepartmentId());
    }
}
