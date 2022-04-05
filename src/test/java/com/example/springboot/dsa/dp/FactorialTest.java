package com.example.springboot.dsa.dp;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class FactorialTest {
    Factorial factorial=new Factorial();
    @Test
    public void testFactorialRecursion(){
        long startTime=System.currentTimeMillis();
        Assert.isTrue(factorial.factorial(1000)==1000);
        System.out.println(System.currentTimeMillis()-startTime);
    }
}
