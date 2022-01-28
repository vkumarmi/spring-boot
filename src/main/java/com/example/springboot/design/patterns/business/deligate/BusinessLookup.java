package com.example.springboot.design.patterns.business.deligate;

import javax.naming.OperationNotSupportedException;

public class BusinessLookup {
    public BusinessService getBusinessService(String businessType) {
        if (businessType.equalsIgnoreCase("one")) {
            return new OneService();
        }
        if (businessType.equalsIgnoreCase("two")) {
            return new TwoService();
        }
        throw new RuntimeException();
    }
}
