package com.example.springboot.design.patterns.business.deligate;

public class OneService implements BusinessService{

    @Override
    public void doProcessing() {
        System.out.println("One Service");
    }
}
