package com.example.springboot.interviews.blueoptima.usingapi;

import java.math.BigDecimal;

public class AreaV1 {
    private String name;

    private BigDecimal area;

    public AreaV1(String name, BigDecimal area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "AreaV1{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
