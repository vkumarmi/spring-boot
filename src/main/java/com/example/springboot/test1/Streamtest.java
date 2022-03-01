package com.example.springboot.test1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Streamtest {
    public static void main(String[] args) {
        List<Employee> lst=new ArrayList<>();
        lst.add(new Employee(1,"virendra",36));
       lst.add(new Employee(2,"dhirendra",25));

        System.out.println(lst.stream().map(employee -> employee.age).collect(Collectors.summingInt(number->number)));
    }

    static class Employee{
    Employee(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
        int id;
        String name;
        int age;
    }
}
