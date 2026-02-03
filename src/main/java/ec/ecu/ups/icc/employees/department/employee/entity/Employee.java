package ec.ecu.ups.icc.employees.department.employee.entity;



import ec.ecu.ups.icc.employees.department.dto.DepartmentMiniDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Character active;
    private DepartmentMiniDto departmentMiniDto;




   

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


   

    public Character getActive() {
        return active;
    }


    public void setActive(Character active) {
        this.active = active;
    }


    public DepartmentMiniDto getDepartmentMiniDto() {
        return departmentMiniDto;
    }


    public void setDepartmentMiniDto(DepartmentMiniDto departmentMiniDto) {
        this.departmentMiniDto = departmentMiniDto;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    


    
}
