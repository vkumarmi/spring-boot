package com.example.springboot.test1;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class Streamtest {
    public static void main(String[] args) {
        List<Employee> lst=new ArrayList<>();
        lst.add(new Employee(1,"virendra",36));
        Set<Integer> sets=new HashSet<>();
       lst.add(new Employee(2,"dhirendra",25));
        //Collections.EMPTY_LIST;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id && age == employee.age && Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, age);
        }
    }
}
