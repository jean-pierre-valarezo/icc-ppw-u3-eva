package ec.ecu.ups.icc.employees.department.employee.dto;

import java.math.BigDecimal;

import ec.ecu.ups.icc.employees.department.dto.DepartmentMiniDto;
import ec.ecu.ups.icc.employees.department.entity.Department;

public class EmployeeWithDepartmentDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private BigDecimal salary;
    private DepartmentMiniDto department;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public DepartmentMiniDto getDepartment() {
        return department;
    }
    public void setDepartment(DepartmentMiniDto department) {
        this.department = department;
    }

    
   
}
