package com.zxytech.designpatterns.gof.structuralpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 2016/12/18.
 */
public class Employee {
    private String name;
    private String dept;
    private float salary;
    private List<Employee> subOrdinates;

    // 构造函数
    public Employee(String name, String dept, float salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subOrdinates = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        subOrdinates.add(employee);
    }

    public void remove(Employee employee) {
        subOrdinates.remove(employee);
    }

    public List<Employee> getSubOrdinates() {
        return subOrdinates;
    }

    public String toString() {
        return ("Employee: [Name: " + name + " dept: " + dept + " salary: " + salary + "]");
    }
}
