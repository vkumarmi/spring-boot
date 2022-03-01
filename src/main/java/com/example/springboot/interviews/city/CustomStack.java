package com.example.springboot.interviews.city;

public class CustomStack {
    private int [] stack=new int[5];
    private int top=-1;
    private final int MAX=5;
    private int max=Integer.MIN_VALUE;
    private int secondMax=Integer.MIN_VALUE;

    public void push(int element){
        if(top==MAX-1){
            throw new RuntimeException("Stack full");
        }
    }

  /*  public int pop(){
      *//*
    }*/


}
