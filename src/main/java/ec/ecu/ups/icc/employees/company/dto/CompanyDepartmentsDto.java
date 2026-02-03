package ec.ecu.ups.icc.employees.company.dto;

import java.util.ArrayList;
import java.util.List;

import ec.ecu.ups.icc.employees.department.dto.DepartmentSummaryDto;

public class CompanyDepartmentsDto {

    private Long companyId;
    private String companyName;
    private String country;
    private Integer departmentCount;
    private Double totalBudget;
    private List<DepartmentSummaryDto> departments = new ArrayList<>();


    
    
    public Long getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Integer getDepartmentCount() {
        return departmentCount;
    }
    public void setDepartmentCount(Integer departmentCount) {
        this.departmentCount = departmentCount;
    }
    public Double getTotalBudget() {
        return totalBudget;
    }
    public void setTotalBudget(Double totalBudget) {
        this.totalBudget = totalBudget;
    }
    public List<DepartmentSummaryDto> getDepartments() {
        return departments;
    }
    public void setDepartments(List<DepartmentSummaryDto> departments) {
        this.departments = departments;
    }

    
}
