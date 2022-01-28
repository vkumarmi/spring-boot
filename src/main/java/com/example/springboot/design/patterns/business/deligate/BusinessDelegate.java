package com.example.springboot.design.patterns.business.deligate;

public class BusinessDelegate {
    private BusinessLookup businessLookup=new BusinessLookup();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService= businessLookup.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
