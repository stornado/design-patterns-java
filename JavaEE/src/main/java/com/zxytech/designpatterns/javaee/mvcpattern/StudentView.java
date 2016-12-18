package com.zxytech.designpatterns.javaee.mvcpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
