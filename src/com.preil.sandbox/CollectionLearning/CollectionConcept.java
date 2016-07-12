package com.preil.sandbox.CollectionLearning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Ilya 12.07.2016.
 */
public class CollectionConcept {

    public static void main(String[] args) {
        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor panel", 25);
        Product window = new Product("Window", 20);

        // Defining new collection here
        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        System.out.println(products);

        // using iterator:
        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext())
        {
            Product product = productIterator.next();
            if(product.getWeight()>20) {
                System.out.println(product);
            } else {
                productIterator.remove();
            }
        }
        System.out.println(products);

        // using forEach method (old form):
        for (Product product:products){
            System.out.println(product);
        }
        // forEach new form:
        products.forEach(System.out::println);

        // other methods to work with collections:

        System.out.println("Products size: " + products.size());
        System.out.println("Products is Empty: " + products.isEmpty());
        System.out.println("Products contains window:" + products.contains(window));
        System.out.println("Products contains door:" + products.contains(door));

        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(door);
        products.removeAll(otherProducts);

        System.out.println(products);
        products.remove(floorPanel);
        System.out.println(products);


    }
}
