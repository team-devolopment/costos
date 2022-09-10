package co.gov.mintic.costos.service;

import co.gov.mintic.costos.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService implements ITransactionService {
    @Override
    public Transaction findById(long id) {
        Transaction transaction = new Transaction();
        transaction.setIdTransaction(1);
        transaction.setConcept("Empleado");
        transaction.setAmount(10);
        return transaction;
    }

    @Override
    public List<Transaction> findByAll() {
        List<Transaction> transactionLists = new ArrayList<>();
        Transaction transaction1 = new Transaction();
        Transaction transaction2 = new Transaction();
        transaction1.setIdTransaction(1);
        transaction1.setConcept("Director");
        transaction1.setAmount(500);
        transaction2.setIdTransaction(2);
        transaction2.setConcept("Gerente");
        transaction2.setAmount(200);
        transactionLists.add(transaction1);
        transactionLists.add(transaction2);
        return transactionLists;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        Transaction transaction1 = new Transaction();
        transaction1.setIdTransaction(transaction.getIdTransaction());
        transaction1.setConcept(transaction.getConcept());
        transaction1.setAmount(transaction.getAmount());
        return transaction1;
    }

    @Override
    public Transaction updateTransaction(long id, Transaction transaction) {
        Transaction transaction1 = findById(id);
        transaction1.setIdTransaction(transaction.getIdTransaction());
        transaction.setAmount(transaction1.getAmount());
        transaction.setConcept(transaction.getConcept());
        return transaction1;
    }

    @Override
    public void deleteTransaction(long id) {
        Transaction transaction = findById(id);
    }
}
