package com.zxytech.designpatterns.gof.structuralpatterns.compositepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 30000.0f);
        Employee headSales = new Employee("Robert", "Head Sales", 20000f);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000f);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        // 打印组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubOrdinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubOrdinates()) {
                System.out.println(employee);
            }
        }
    }
}
