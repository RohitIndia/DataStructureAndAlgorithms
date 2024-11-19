package com.ds.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        Map<Integer, List<String>> mapOfGpaWithName = StudentDataBase
                .getStudentList()
                .stream()
                .collect(Collectors.groupingBy(Student::getGpa, Collectors.mapping(e->e.getName(), Collectors.toList())));

        System.out.println(mapOfGpaWithName.toString());

        List<Integer> list1 = Arrays.asList(1,1,1,1,1,1,1,2,3,4,5,6,7,7,6,6,4,2,3,4,234,23,4,3,2,1,3,4,5);

        Map<Integer, Long> countDuplicates = Optional.ofNullable(list1).orElseThrow(()->new RuntimeException("List cannot be null"))
                .stream()
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));

        System.out.println(countDuplicates);

        List<Integer> showDuplicateNumber = Optional.ofNullable(list1).orElseThrow(()->new RuntimeException("List cannot be null"))
                .stream()
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m->m.getValue()>1).map(m1-> m1.getKey())
                .collect(Collectors.toList());

        System.out.println(showDuplicateNumber);

        // Factorial of a number
        int n = 5;
        int fact = IntStream.rangeClosed(1,n).reduce(1, (a,b)->a*b);
        System.out.println(fact(5));
        System.out.println(fibbonacci(5));
        for(int i = 0; i<=n;i++){
            System.out.println(fibbonacci(i));
        }
    }

    private static int fact(int n){
        if(n==1){
            return n;
        }
        return n*fact(n-1);
    }

    private static int fibbonacci(int n){
        if(n<=1) return n;
        return fibbonacci(n-1 )+ fibbonacci(n-2);
    }

}
