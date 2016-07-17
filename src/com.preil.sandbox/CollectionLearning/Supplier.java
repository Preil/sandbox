package com.preil.sandbox.CollectionLearning;

import java.util.ArrayList;
import java.util.List;

/**
 * Ilya 16.07.2016.
 */
public class Supplier {
    private final String name;
    public final List<Product> products = new ArrayList<>();
    public Supplier(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public List<Product> products(){
        return products;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
