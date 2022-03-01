package com.example.springboot.util;

import com.example.springboot.test.Factory;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class FactoryTest {

    Factory factory=Factory.getFactory();

    @Test
    public void testFactory(){
        Assert.isTrue(factory.getShape("Triangle") instanceof Factory.Triangle);
        Assert.isTrue(factory.getShape("Rectangle") instanceof Factory.Rectangle);
    }



}
