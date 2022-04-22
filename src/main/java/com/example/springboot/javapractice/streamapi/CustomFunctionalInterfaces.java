package com.example.springboot.javapractice.streamapi;

public class CustomFunctionalInterfaces {

    public static void main(String[] args) {
        int a=3;
        int b=4;
        int result=new CustomFunctionalInterfaces().sum((num1,num2)->{return num1+num2;},3,4);
        System.out.println(result);
    }

    public int sum(FunctionalInterface<Integer,Integer,Integer> functionalInterface,int num1,int num2){
        return functionalInterface.sum(num1,num2);
    }



}


interface  FunctionalInterface<S,T,R>{
    R sum(S value1,T value2);
}









