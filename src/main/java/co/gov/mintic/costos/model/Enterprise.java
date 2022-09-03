package co.gov.mintic.costos.model;


import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Enterprise {

    private long id;
    private String name;
    private String document;
    private String adress;
    private List<Employee> employee;
    private List<Transaction> transaction;
    private Date createdAT;
    private Date updateAT;

    public Enterprise(long id, String name, String document, String adress, List<Employee> employee, List<Transaction> transaction, Date createdAT, Date updateAT) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.adress = adress;
        this.employee = employee;
        this.transaction = transaction;
        this.createdAT = createdAT;
        this.updateAT = updateAT;
        employee = new ArrayList<Employee>();
        transaction = new ArrayList<Transaction>();
    }

    public void addTransations(Transaction transactions) {
        this.transaction.add(transactions);
    }

    public void addEmployee(Employee employee) {
        this.employee.add(employee);
    }

}
