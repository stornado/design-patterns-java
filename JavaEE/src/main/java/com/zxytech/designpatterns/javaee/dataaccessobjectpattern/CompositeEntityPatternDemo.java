package com.zxytech.designpatterns.javaee.dataaccessobjectpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();

        System.out.println("输出所有学生的初始信息:");
        for (Student student : studentDAO.getAllStudents()) {
            System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name: " + student.getName() + "]");
        }


        System.out.println("\n更新学生0姓名:");
        Student student = studentDAO.getAllStudents().get(0);
        student.setName("Michael");
        studentDAO.updateStudent(student);

        // 获取学生
        System.out.println("Student: [RollNo: " + studentDAO.getStudent(0).getRollNo() + ", Name: " + studentDAO.getStudent(0).getName() + "]");

        System.out.println("\n删除学生1信息:");
        studentDAO.deleteStudent(studentDAO.getStudent(1));


        System.out.println("\n输出剩余所有学生当前信息:");
        for (Student aStudent : studentDAO.getAllStudents()) {
            System.out.println("Student: [RollNo: " + aStudent.getRollNo() + ", Name: " + aStudent.getName() + "]");
        }

    }
}
