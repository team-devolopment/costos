package co.gov.mintic.costos.controller;

import co.gov.mintic.costos.model.Employee;
import co.gov.mintic.costos.model.Enterprise;
import co.gov.mintic.costos.model.RoleName;
import co.gov.mintic.costos.model.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {


    @GetMapping("/employee/{id}")
    public Employee findById(@PathVariable long id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setEmail("kerly@hotmail.com");
        RoleName roleName = RoleName.OPERARIO;
        employee.setRoleName(roleName);
        Enterprise enterprise = new Enterprise();
        enterprise.setName("fabian");
        enterprise.setId(10);
        employee.setEnterprice(enterprise);

        List<Transaction> transactions = new ArrayList<>();
        Transaction transaction1 = new Transaction();
        Transaction transaction2 = new Transaction();
        transaction1.setId(1);
        transaction1.setConcept("Director");
        transaction1.setAmount(500);
        transaction2.setId(2);
        transaction2.setConcept("Gerente");
        transaction2.setAmount(200);
        transactions.add(transaction1);
        transactions.add(transaction2);
        employee.setTransactions(transactions);
        return employee;
    }

    @GetMapping("/employee")
    public List<Employee> finByAll() {
        List listEmployees = new ArrayList<>();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.setId(1);
        employee1.setEmail("Lex112286@hot");
        employee2.setId(2);
        employee2.setEmail("Lex112286@hot");
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        return listEmployees;

    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {  //@RequestBody
        Employee newEmployee = new Employee();
        newEmployee.setId(3);
        newEmployee.setEmail(employee.getEmail());
        newEmployee.setRoleName(employee.getRoleName());
        newEmployee.setEnterprice(employee.getEnterprice());
        newEmployee.setTransactions(employee.getTransactions());

        return newEmployee;
    }

    @PutMapping("/employee/{id}")
    public Employee UpdateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        Employee employee1 = findById(id);
        employee1.setEmail(employee.getEmail());
        employee1.setRoleName(employee.getRoleName());
        employee1.setEnterprice(employee.getEnterprice());
        employee1.setTransactions(employee.getTransactions());
        return employee1;
    }

    @DeleteMapping("/employee/{idemployee}")
    public void deleteEmployee(@PathVariable int idemployee) {
        Employee employee = findById(idemployee);
    }

}





