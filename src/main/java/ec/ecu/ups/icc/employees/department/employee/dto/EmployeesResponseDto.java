package ec.ecu.ups.icc.employees.department.employee.dto;

import java.util.ArrayList;
import java.util.List;

public class EmployeesResponseDto {

    private String companyName;
    private Double minSalary;
    private Integer count;
    private List<EmployeeWithDepartmentDto> employees = new ArrayList<>();

    
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public Double getMinSalary() {
        return minSalary;
    }
    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public List<EmployeeWithDepartmentDto> getEmployees() {
        return employees;
    }
    public void setEmployees(List<EmployeeWithDepartmentDto> employees) {
        this.employees = employees;
    }


   
  
}
