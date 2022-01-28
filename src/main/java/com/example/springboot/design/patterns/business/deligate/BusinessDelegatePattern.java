package com.example.springboot.design.patterns.business.deligate;

public class BusinessDelegatePattern {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate=new BusinessDelegate();
        businessDelegate.setServiceType("one");

        Client client=new Client(businessDelegate);
        client.doTask();
        businessDelegate.setServiceType("two");
        client.doTask();
    }
}
