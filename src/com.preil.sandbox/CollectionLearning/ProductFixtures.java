package com.preil.sandbox.CollectionLearning;

/**
 * Ilya 13.07.2016.
 */
public class ProductFixtures {
    public static Product door = new Product(1, "Wooden door", 35);
    public static Product floorPanel = new Product(2, "Floor Panel", 25);
    public static Product window = new Product(3, "Glass window", 10);

    public static Supplier bobs = new Supplier("Bob's Household Supplies");
    public static Supplier kates = new Supplier("Kate's Home Goods");

    static {
        bobs.products().add(door);
        bobs.products().add(floorPanel);

        kates.products().add(floorPanel);
        kates.products().add(door);
        kates.products().add(window);
    }
}
