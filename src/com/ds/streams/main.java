package com.ds.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<String> namesFromStudentDb = StudentDataBase.getStudentList().stream().map((student)->student.getName()).collect(Collectors.toList());
        System.out.println(namesFromStudentDb);

        // example of Flatmap
        Set<String> Activities = StudentDataBase.getStudentList().stream().map(student -> student.getActivities()).flatMap(list->list.stream()).sorted().collect(Collectors.toSet()); // usage of set to distinct the
        System.out.println(Activities);

       long count = StudentDataBase.getStudentList().stream().map(student -> student.getActivities()).flatMap(list->list.stream()).distinct().count(); // usage of set to distinct the
        System.out.println("Distinct count : "+count);

        // Filter
    }


}
