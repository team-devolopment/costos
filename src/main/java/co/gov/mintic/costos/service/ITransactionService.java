package co.gov.mintic.costos.service;

import co.gov.mintic.costos.model.Transaction;

import java.util.List;

public interface ITransactionService {

    public Transaction findById(long id);

    public List<Transaction> findByAll();

    public Transaction createTransaction(Transaction transaction);

    public Transaction updateTransaction(long id, Transaction transaction);

    public void deleteTransaction(long id);


}
