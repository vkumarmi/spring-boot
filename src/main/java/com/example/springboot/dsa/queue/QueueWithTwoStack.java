package com.example.springboot.dsa.queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueWithTwoStack<E> {
    private Stack<E> front=new Stack<>();
    private Stack<E> rear=new Stack<>();

    private volatile boolean isDequeue=false;
    public E enqueue(E element){
        System.out.println("Enqueue!!"+element);
    if(isDequeue){
        while (!front.empty()){
            rear.push(front.pop());
        }
        isDequeue=false;
    }
    return rear.push(element);
    }

    public E dequeue(){

        if(!isDequeue){
            while (!rear.isEmpty()){
                front.push(rear.pop());
            }
            isDequeue=true;
        }
        System.out.println("Dequeued!!"+front.peek());
        return front.pop();
    }

    public void print(){
        if(!isDequeue){
            while (!rear.isEmpty()){
                front.push(rear.pop());
            }
            isDequeue=true;
        }
        E element;
        while (!front.isEmpty()){
            element=front.pop();
            System.out.print(element);
            System.out.print(",");
            rear.push(element);
        }
        isDequeue=false;
        System.out.println();
    }

    public E printFront(){
        if(!isDequeue){
            while (!rear.isEmpty()){
                front.push(rear.pop());
            }
            isDequeue=true;
        }
        return front.peek();
    }

    public static void main(String[] args) {
        QueueWithTwoStack<Integer> qwts=new QueueWithTwoStack<>();
        Scanner scanner=new Scanner(System.in);
       int question= scanner.nextInt();
       int option;
       int value;
       String [] arguments;
       String argument=null;
       for(int i=0;i<question;i++){
           while (argument==null || argument.isEmpty())
               argument=scanner.nextLine();
           arguments=argument.split(" ");
           option=Integer.valueOf(arguments[0]);
           switch (option){
               case 1:
                   value=Integer.valueOf(arguments[1]);
                   qwts.enqueue(value);
                   argument=null;
                   break;
               case 2:
                   qwts.dequeue();
                   argument=null;
                   break;
               case 3:
                   System.out.println(qwts.printFront());
                   argument=null;
               break;
               default:
                   System.out.println("wrong choice!!");
           }
       }

        qwts.enqueue(1);
        qwts.enqueue(2);
        qwts.enqueue(3);
        qwts.print();
        qwts.dequeue();
        qwts.print();
    }
}
