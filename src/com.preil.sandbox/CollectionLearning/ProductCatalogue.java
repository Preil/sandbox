package com.preil.sandbox.CollectionLearning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * Ilya 16.07.2016.
 */
public class ProductCatalogue implements Iterable<Product> {

    private final Set<Product> products = new HashSet<>();
    public void isSuppliedBy (Supplier supplier){
        products.addAll(supplier.products());
    }

    @Override
    public String toString() {
        return "ProductCatalogue{" +
                "products=" + products +
                '}';
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
