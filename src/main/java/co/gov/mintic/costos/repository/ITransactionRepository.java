package co.gov.mintic.costos.repository;

import co.gov.mintic.costos.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransactionRepository extends CrudRepository<Transaction, Long> {
}
