package co.gov.mintic.costos.service;

import co.gov.mintic.costos.model.Employee;

import java.util.List;

public interface IEmployeeService {

    public Employee findById(long id);

    public List<Employee> findAll();

    public Employee createEmployee(Employee employee);

    public Employee updateEmployee(long id, Employee employee);

    public void deleteEmployee(long id);

}
