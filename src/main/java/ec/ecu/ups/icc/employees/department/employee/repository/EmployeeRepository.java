package ec.ecu.ups.icc.employees.department.employee.repository;


import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import ec.ecu.ups.icc.employees.department.employee.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByIdAndActive(Long id, Character active);

    List<Employee> findByDepartmentIdAndActive(
            Long departmentId,
            Character active,
            Sort sort
    );

    int countByDepartmentIdAndActive(Long id, char c);

    List<Employee> findHighSalary(Long companyId, double min);
}
