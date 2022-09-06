package co.gov.mintic.costos.controller;


import co.gov.mintic.costos.model.Transaction;
import co.gov.mintic.costos.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionRestController {

    @Autowired
    public ITransactionService transactionService;

    @GetMapping("/transaction/{id}")
    public Transaction findById(@PathVariable long id) {
        return this.transactionService.findById(id);
    }

    @GetMapping("/transaction")
    public List<Transaction> findByid(){
        return this.transactionService.findByAll();
    }

    @PostMapping("/transaction")
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return this.transactionService.createTransaction(transaction);
    }

    @PutMapping("/transaction/{id}")
    public Transaction updateTransaction(@PathVariable long id, @RequestBody Transaction transaction){
        return this.transactionService.updateTransaction(id, transaction);
    }

    @DeleteMapping("/transaction/{id}")
    public void deleteTransaction(@PathVariable int id){
        this.transactionService.deleteTransaction(id);

    }


}
