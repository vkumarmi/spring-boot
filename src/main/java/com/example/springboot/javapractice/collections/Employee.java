package com.example.springboot.javapractice.collections;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private Long id;
    private String name;
    private int rank;
    private double salary;


    public Employee() {

    }



    public Employee(Long id, String name, int rank,double salary) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.salary=salary;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return rank == employee.rank && Double.compare(employee.salary, salary) == 0 && Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rank, salary);
    }

    @Override
    public int compareTo(Employee o) {
        return (int) ((int)this.salary-o.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", salary=" + salary +
                '}';
    }
}
