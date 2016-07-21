package com.preil.sandbox.CollectionLearning.QueueTrainings;

/**
 * Ilya 20.07.2016.
 */
public class Product {
    private final String name;
    private final int price;

    public static Product radio = new Product("Sony radio", 35);
    public static Product tvset = new Product("LG TV set", 700);
    public static Product fridge = new Product("Sharp fridge", 1500);


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "GeneralProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
