package co.gov.mintic.costos.repository;

import co.gov.mintic.costos.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnterpriseRepository extends CrudRepository<Enterprise, Long> {
}
