package com.example.springboot.design.patterns.business.deligate;

public class Client {

    BusinessDelegate businessDelegate;
    public Client(BusinessDelegate businessDelegate){
        this.businessDelegate=businessDelegate;
    }

    public void doTask(){
        businessDelegate.doTask();
    }
}
