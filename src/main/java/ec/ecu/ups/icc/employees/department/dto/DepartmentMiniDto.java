package ec.ecu.ups.icc.employees.department.dto;

public class DepartmentMiniDto {

    private Long id;
    private String name;
    

    public DepartmentMiniDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
}
