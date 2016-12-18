package com.zxytech.designpatterns.javaee.transferobjectpattern;

/**
 * Created by ryan on 2016/12/18.
 * 作为客户端演示传输对象模式
 */
public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        System.out.println("输出所有学生的初始信息:");
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name: " + student.getName() + "]");
        }


        System.out.println("\n更新学生0姓名:");
        StudentVO student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        // 获取学生
        System.out.println("Student: [RollNo: " + studentBusinessObject.getStudent(0).getRollNo() + ", Name: " + studentBusinessObject.getStudent(0).getName() + "]");

        System.out.println("\n删除学生1信息:");
        studentBusinessObject.deleteStudent(studentBusinessObject.getStudent(1));


        System.out.println("\n输出剩余所有学生当前信息:");
        for (StudentVO aStudent : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo: " + aStudent.getRollNo() + ", Name: " + aStudent.getName() + "]");
        }
    }
}
