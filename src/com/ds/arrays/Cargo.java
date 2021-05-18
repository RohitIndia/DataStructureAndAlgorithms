package com.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Cargo {

    public static void main(String args[]){
        Consumer<Student> c1 = student -> System.out.println(student.getName());
        Consumer<Student> c2 = student -> System.out.println(student.getRollNo());
        int sum = IntStream.rangeClosed(0,100).sum();
        System.out.println(sum);
        Student s1 = new Student(1,"rohit",3);
        Student s2 = new Student(1,"aj",3);
        Student s3 = new Student(1,"s",3);
        Student s4 = new Student(1,"sasa",3);
        List<Student> ls = new ArrayList<Student>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);

        ls.forEach(student -> {
            if(student.grade>1){
                c1.andThen(c2).accept(student);
            }
        });

List<String> list = Arrays.asList(s1.getName());
System.out.println(list);

    }

}
