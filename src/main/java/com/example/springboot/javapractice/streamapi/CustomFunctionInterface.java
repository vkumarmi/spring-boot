package com.example.springboot.javapractice.streamapi;

public interface CustomFunctionInterface<T,S,R> {
     R  apply(T item1,S item2);
     default void print1(){
         System.out.println("in default 1");
     }
     default void print2(){
         System.out.println(" in default 2");
     }
}
