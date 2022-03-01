package com.example.springboot.interviews.city;

public class Deadlock {
    private Object lock1=new Object();
    private Object lock2=new Object();

    private void acquireLock1() throws InterruptedException {
        synchronized (lock1){
            System.out.println("aquired lock 1 by "+Thread.currentThread().getName());
            Thread.sleep(1000);
            acquireLock2();
        }
    }

    private void acquireLock2(){
        synchronized (lock2){
            System.out.println("acquired lock 2 by "+Thread.currentThread().getName());
        }
    }
}
