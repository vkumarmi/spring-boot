package com.example.springboot.javapractice.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetManager {
    public static void main(String[] args) {
        Set<Employee> employeeSet=new TreeSet<>(Set.of(new Employee(1L,"virendra",10,140000.23),new Employee(2L,"Dhirendra",11,25000.12),new Employee(34L,"Rajendra",12,150000.00),new Employee(5L,"Gajendra",5,200000)));
        employeeSet.add(new Employee(1L,"virendra",10,140000.23));
        employeeSet.stream().forEach(System.out::println);


    }
}
