package com.zxytech.designpatterns.javaee.dataaccessobjectpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 2016/12/18.
 */
public class StudentDAOImpl implements StudentDAO {
    // 列表是当作一个数据库
    List<Student> students;

    public StudentDAOImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("John", 1);
        students.add(student1);
        students.add(student2);
    }

    // 从数据库中检索学生名单
    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database.");
    }

    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database.");
    }
}
