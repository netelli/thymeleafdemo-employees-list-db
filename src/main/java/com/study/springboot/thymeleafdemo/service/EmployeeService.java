package com.study.springboot.thymeleafdemo.service;

import com.study.springboot.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deleteById(int id);
}
