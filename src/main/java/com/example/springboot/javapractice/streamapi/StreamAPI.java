package com.example.springboot.javapractice.streamapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("hello",1);
        map.put("Hello",2);
        map.put("world",5);
        map.put("suno",2);

        //lazyAndEagerStreamMethods();
        testStreamPersistent();
    }


      static void lazyAndEagerStreamMethods(){
          List<String> list= Arrays.asList("Hello","how","are","you");
          list.stream()
                  .filter(artist-> {System.out.println(artist);
                  return artist.equalsIgnoreCase("you");})
          .count();
          List<String> stringList=Arrays.asList("1","2","3","4","5");
         List<Integer> integerList= stringList.stream().map(Integer::parseInt).collect(Collectors.toList());

    integerList.stream().forEach(System.out::println);
    }

    public static void testStreamPersistent(){
        List<Integer> integerList=Arrays.asList(1,2,3,4,5,6,6,7,8,9,1,2,3,4,5,6,7,8,9,1,10,23,45,23,4,56,43,54,87,89);
        Stream<Integer> evenStream=integerList.stream().filter(number->number%2==0);
        Stream<Integer> oddStream=integerList.stream().filter(number->number%2==1);
        //evenStream.forEach(System.out::println);
        //oddStream.forEach(System.out::println);
        System.out.println(integerList.stream().count());
        //System.out.println(evenStream.count());
       // System.out.println(oddStream.count());
        integerList=integerList.stream().filter(number->number>20).collect(Collectors.toList());
        System.out.println(integerList.stream().count());
        System.out.println(evenStream.count());
        System.out.println(oddStream.count());
    }

}
