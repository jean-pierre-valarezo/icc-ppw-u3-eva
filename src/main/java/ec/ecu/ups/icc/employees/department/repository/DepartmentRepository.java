package ec.ecu.ups.icc.employees.department.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.ecu.ups.icc.employees.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Optional<Department> findByIdAndActive(Long id, Character active);
    List<Department> findByCompanyIdAndActive(Long companyId, Character active);
    
}
