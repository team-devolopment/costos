package co.gov.mintic.costos.controller;


import co.gov.mintic.costos.model.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionRestController {

    @GetMapping("/transaction/{id}")
    public Transaction findById(@PathVariable long id) {
        Transaction transaction = new Transaction();
        transaction.setId(1);
        transaction.setConcept("Empleado");
        transaction.setAmount(10);
        return transaction;
    }

    @GetMapping("/transaction")
    public List<Transaction> findByid(){
        List<Transaction> transactionLists = new ArrayList<>();
        Transaction transaction1 = new Transaction();
        Transaction transaction2 = new Transaction();
        transaction1.setId(1);
        transaction1.setConcept("Director");
        transaction1.setAmount(500);
        transaction2.setId(2);
        transaction2.setConcept("Gerente");
        transaction2.setAmount(200);
        transactionLists.add(transaction1);
        transactionLists.add(transaction2);
        return transactionLists;
    }

    @PostMapping("/transaction")
    public Transaction insertTransaction(@RequestBody Transaction transaction){
        Transaction transaction1 = new Transaction();
        transaction1.setId(transaction.getId());
        transaction1.setConcept(transaction.getConcept());
        transaction1.setAmount(transaction.getAmount());
        return transaction;

    }

    @PutMapping("/transaction/{id}")
    public Transaction updateTransaction(@PathVariable long id, @RequestBody Transaction transaction){
        Transaction transaction1 = findById(id);
        transaction1.setId(transaction.getId());
        transaction.setAmount(transaction1.getAmount());
        transaction.setConcept(transaction.getConcept());
        return transaction;
    }

    @DeleteMapping("/transaction/{id}")
    public void deleteTransaction(@PathVariable int id){
        Transaction transaction = findById(id);

    }


}
