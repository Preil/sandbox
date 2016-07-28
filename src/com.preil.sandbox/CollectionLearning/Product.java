package com.preil.sandbox.CollectionLearning;

import java.util.Comparator;

/**
 * Ilya 12.07.2016.
 */
public class Product {
//    public static final Comparator<GeneralProduct> BY_WEIGHT
//            = (p1, p2) -> Integer.compare(p1.getWeight(), p2.getWeight());
    public static final Comparator<Product> BY_WEIGHT =
        Comparator.comparing(Product::getWeight);
    public static final Comparator<Product> BY_NAME =
        Comparator.comparing(Product::getName);


    private final int id;
    private final String name;
    private final int weight;

    public Product(final int id, final String name, final int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
