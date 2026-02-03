
package ec.ecu.ups.icc.employees.company.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.ecu.ups.icc.employees.company.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Optional<Company> findByIdAndActive(Long id, Character active);
}
