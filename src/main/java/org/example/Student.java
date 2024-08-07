package org.example;

import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private String address;
    private List<Integer> marks;

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student() {
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Student(int studentID, String name, String address, List<Integer> marks) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }
}
