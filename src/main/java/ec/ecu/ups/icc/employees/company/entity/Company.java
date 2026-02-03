package ec.ecu.ups.icc.employees.company.entity;



import jakarta.persistence.*;
import java.util.List;

import ec.ecu.ups.icc.employees.department.entity.Department;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    private Long id;

    private String name;
    private String country;

    private Character active;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private List<Department> departments;


    

    public Company(Long id, String name, String country, Character active, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.active = active;
        this.departments = departments;
    }
    public Long getId() { 
        return id; 
    }
    public String getName() { 
        return name; 
    }
    public String getCountry() {
         return country; 
    }
    public Character getActive() { 
        return active; 
    }

    public void setId(Long id) { 
        this.id = id; 
    }
    public void setName(String name) {
         this.name = name; 
    }

    public void setCountry(String country) { 
        this.country = country; 
    }

    public void setActive(Character active) { 
        this.active = active; 
    }
}
