package co.gov.mintic.costos.service;

import co.gov.mintic.costos.model.*;
import co.gov.mintic.costos.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public Employee findById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.get();
    }

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employee.setCreatedAT(LocalDate.now());
        Employee createEmployee = employeeRepository.save(employee);
        return createEmployee;
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        employee.setUpdateAT(LocalDate.now());
        Employee putEmployee = employeeRepository.save(employee);
        return putEmployee;
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
