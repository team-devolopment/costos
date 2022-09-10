package co.gov.mintic.costos.repository;

import co.gov.mintic.costos.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfileRepository extends CrudRepository<Profile, Long> {
}
