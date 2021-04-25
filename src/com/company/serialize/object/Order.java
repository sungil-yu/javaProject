package com.company.serialize.object;

import java.io.Serializable;

public class Order implements Serializable {

    private String name;

    public Order(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                '}';
    }
}
