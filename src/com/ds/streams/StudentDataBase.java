package com.ds.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

    public static List<Student> getStudentList(){
        Student s1 = new Student("Rohit", 4,1, Arrays.asList("Swimming","Badminton","Table Tennins"));
        Student s2 = new Student("Rahul", 4,2, Arrays.asList("Gym","Cooking","Table Tennins"));

        Student s3 = new Student("Richa", 3,3, Arrays.asList("trecking","Badminton","Lawn Tennins"));
        Student s4 = new Student("Rishabh", 3,4, Arrays.asList("Yoga","Cooking"));

        Student s5 = new Student("Rani", 2,5, Arrays.asList("trecking","Badminton","Lawn Tennins"));
        Student s6 = new Student("Sam", 2,6, Arrays.asList("Yoga","Cooking"));

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(s1);
        listOfStudents.add(s2);
        listOfStudents.add(s3);
        listOfStudents.add(s4);
        listOfStudents.add(s5);
        listOfStudents.add(s6);
        return listOfStudents;
    }

}
