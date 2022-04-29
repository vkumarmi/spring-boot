package com.example.springboot.dsa.dp;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class FactorialTest {
    Factorial factorial=new Factorial();
    @Test
    public void testFactorialRecursion(){
        long startTime=System.currentTimeMillis();
        Assert.isTrue(factorial.factorial(10)==3628800);
        System.out.println(System.currentTimeMillis()-startTime);
    }
}
