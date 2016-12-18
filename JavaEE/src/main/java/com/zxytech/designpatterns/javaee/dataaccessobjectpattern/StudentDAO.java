package com.zxytech.designpatterns.javaee.dataaccessobjectpattern;

import java.util.List;

/**
 * Created by ryan on 2016/12/18.
 */
public interface StudentDAO {
    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
