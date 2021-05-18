package com.ds.streams;
import java.util.List;
public class Student {
    String name;
    int gpa;
    int rollNo;
    List<String> activities;

    public Student(String name, int gpa, int rollNo, List<String> activities) {
        this.name = name;
        this.gpa = gpa;
        this.rollNo = rollNo;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public int getGpa() {
        return gpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public List<String> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", rollNo=" + rollNo +
                ", activities=" + activities +
                '}';
    }
}
