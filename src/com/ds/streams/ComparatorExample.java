package com.ds.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {
    public static void main(String[] args) {
        System.out.print(sortByName(StudentDataBase.getStudentList()));
    }
    public static List<Student> sortByName(List<Student> list){
        return list.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
    }
}
