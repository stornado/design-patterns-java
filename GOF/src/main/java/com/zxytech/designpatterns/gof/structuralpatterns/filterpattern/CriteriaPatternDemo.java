package com.zxytech.designpatterns.gof.structuralpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 2016/12/18.
 * 使用不同的标准（Criteria）和它们的结合来过滤 Person 对象的列表。
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria femal = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singlOrFemale = new OrCriteria(single, femal);

        System.out.println("Males:");
        printPersons(male.meetCriteria(persons));

        System.out.println("Females:");
        printPersons(femal.meetCriteria(persons));

        System.out.println("Single Males:");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("Single Or Female");
        printPersons(singlOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person: [Name: " + person.getName() + " Gender: " + person.getGender() + " Marital Status: " + person.getMaritalStatus() + " ]");
        }
        System.out.println();
    }
}
