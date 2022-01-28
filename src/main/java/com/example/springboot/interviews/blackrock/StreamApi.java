package com.example.springboot.interviews.blackrock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
         Map<Integer,Integer> map=new HashMap<>();//Map.of(2,5 ,4,8 ,7,null ,8,2);// NullPointer Exception as Map.of requires all the arguments to be non null
        map.put(2,5);
        map.put(4,8);
        map.put(7,null);
        map.put(8,2);
        List<Integer> result=map.entrySet().stream().filter(entry-> entry.getValue()!=null && entry.getValue()>5).map((entry)->entry.getValue()).collect(Collectors.toList());
       //result= Optional.<Set<Map.Entry<Integer,Integer>>>ofNullable(map.entrySet()).map(Collection::stream).orElseGet((Supplier<? extends Stream<Map.Entry<Integer, Integer>>>) Stream.<Set<Map.Entry<Integer,Integer>>>empty()).filter()
        result.stream().forEach(System.out::println);
    }
}
