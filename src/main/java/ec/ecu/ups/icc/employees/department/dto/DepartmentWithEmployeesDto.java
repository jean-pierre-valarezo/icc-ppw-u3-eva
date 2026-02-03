package ec.ecu.ups.icc.employees.department.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import ec.ecu.ups.icc.employees.company.entity.Company;
import ec.ecu.ups.icc.employees.department.employee.entity.Employee;

public class DepartmentWithEmployeesDto {
    private Long id;
    private String name;
    private BigDecimal budget;
    private Company company;
    private List<Employee> employees = new ArrayList<>();
    private Integer employeeCount;
    private BigDecimal totalSalaries;

    public DepartmentWithEmployeesDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }

    public BigDecimal getTotalSalaries() {
        return totalSalaries;
    }

    public void setTotalSalaries(BigDecimal totalSalaries) {
        this.totalSalaries = totalSalaries;
    }

    
    
}
