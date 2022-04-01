package com.example.springboot.interviews.here.round3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomStream {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.addAll(Arrays.asList(new Employee(1, "virendra", 1000, "IT"), new Employee(2, "Dhirendra", 1000, "sales"), new Employee(3, "Ankit", 3000, "Dev"), new Employee(4, "yagya", 50000, "IT"), new Employee(6, "Nitesh", 24000, "sales")));
        System.out.println(employeeList.size());
        employeeList.stream().distinct().forEach(System.out::println);
        employeeList.stream().collect(Collectors.groupingBy(employee -> employee.department)).entrySet().stream().forEach(stringListEntry -> System.out.println(stringListEntry.getKey()+":"+stringListEntry.getValue()));
    }



 static class Employee{
        int id;
        String name;
        int salary;
        String department;

    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", salary=" + salary +
                 ", department='" + department + '\'' +
                 '}';
     }
 }

}
