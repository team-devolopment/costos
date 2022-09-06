package co.gov.mintic.costos.controller;

import co.gov.mintic.costos.model.Employee;
import co.gov.mintic.costos.model.Enterprise;
import co.gov.mintic.costos.model.RoleName;
import co.gov.mintic.costos.model.Transaction;
import co.gov.mintic.costos.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class EmployeeRestController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public Employee findById(@PathVariable long id) {
        return this.employeeService.findById(id);
    }

    @GetMapping("/employee")
    public List<Employee> finByAll() {
        return this.employeeService.findAll();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return this.employeeService.createEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee UpdateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        return this.employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        this.employeeService.deleteEmployee(id);
    }

}





