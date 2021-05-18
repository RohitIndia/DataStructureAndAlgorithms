package com.ds.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static Optional<String> getOptionalName(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getStudentList().get(0));
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
        Optional<String> name = getOptionalName();
        System.out.print(name.isPresent()?name.get().length(): 0);
        List<Student> abc = new ArrayList<>();
        abc.toArray();
    }
}
