package com.ds.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapWithStreams {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,2,4,2,4,24,2,4,2,4,2,4,2,1,2,3,2,2,32);
        Map<Integer, Long> mapWithDuplicates = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
