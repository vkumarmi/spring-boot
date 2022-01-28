package com.example.springboot.design.patterns.business.deligate;

public class TwoService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Two Service");
    }
}
