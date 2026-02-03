package ec.ecu.ups.icc.employees.department.entity;

import jakarta.persistence.*;
import ec.ecu.ups.icc.employees.company.entity.Company;

import java.math.BigDecimal;
import java.util.List;

import ec.ecu.ups.icc.employees.department.employee.entity.Employee;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    private Long id;

    private String name;
    private BigDecimal budget;
    private Character active;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Employee> employees;

   

    
    public Long getId() {
         return id; 
    }

    public String getName() {
         return name;
    }

    public BigDecimal getBudget() { 
        return budget; 
    }
    public Character getActive() { 
        return active; 
    }
    public Company getCompany() { 
        return company; 
    }

    public void setId(Long id) { 
        this.id = id; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public void setBudget(BigDecimal budget) { 
        this.budget = budget; 
    }
    public void setActive(Character active) { 
        this.active = active; 
    }
    public void setCompany(Company company) { 
        this.company = company;
     }
}
