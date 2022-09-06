package co.gov.mintic.costos.service;

import co.gov.mintic.costos.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService implements IEmployeeService{

    @Override
    public Employee findById(long id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setEmail("kerly@hotmail.com");
        Profile profile = new Profile();
        profile.setId(1);
        profile.setImage("Casa");
        employee.setProfile(profile);
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

    @Override
    public List<Employee> findAll() {
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

    @Override
    public Employee createEmployee(Employee employee) {
        Employee newEmployee = new Employee();
        newEmployee.setId(3);
        newEmployee.setEmail(employee.getEmail());
        newEmployee.setRoleName(employee.getRoleName());
        newEmployee.setEnterprice(employee.getEnterprice());
        newEmployee.setTransactions(employee.getTransactions());
        return newEmployee;
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        Employee employee1 = findById(id);
        employee1.setEmail(employee.getEmail());
        employee1.setRoleName(employee.getRoleName());
        employee1.setEnterprice(employee.getEnterprice());
        employee1.setTransactions(employee.getTransactions());
        return null;
    }

    @Override
    public void deleteEmployee(long id) {
        Employee employee = findById(id);
    }
}
