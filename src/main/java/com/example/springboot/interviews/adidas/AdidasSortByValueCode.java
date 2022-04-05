package com.example.springboot.interviews.adidas;

import java.util.*;
import java.util.stream.Collectors;

public class AdidasSortByValueCode {
///{x=[1, 3], y=[2], z=[4]}
    public static void main(String []args) {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "x");
            map.put(2, "y");
            map.put(3, "x");
            map.put(4, "z");

            Map<String, List<Integer>> sortedmap =  (Map<String,List<Integer>>)map.entrySet().stream()
                    .collect(Collectors.groupingBy(entry->entry.getValue(),Collectors.mapping(entry->entry.getKey(),Collectors.toList())));


            map.entrySet().stream().sorted(Comparator.comparing(integerStringEntry -> integerStringEntry.getValue())).forEach(System.out::println);
        // Uncomment below line and print
            System.out.println("sortedmap"+sortedmap);
        }

}
