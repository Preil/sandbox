package com.preil.sandbox.CollectionLearning;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static com.preil.sandbox.CollectionLearning.Product.BY_WEIGHT;


/**
 * Ilya 16.07.2016.
 */
public class ProductCatalogue implements Iterable<Product> {

    private final SortedSet<Product> products = new TreeSet<>(BY_WEIGHT);
    public void isSuppliedBy (Supplier supplier){
        products.addAll(supplier.products());
    }
    public Set<Product> lightVanProducts(){
        Product lightestHeavyVanProduct = findLightestHeavyVanProduct();
        return products.headSet(lightestHeavyVanProduct);
    }
    public Set<Product> heavyVanProducts(){
        Product lightestHeavyVanProduct = findLightestHeavyVanProduct();
        return products.tailSet(lightestHeavyVanProduct);
    }

    private Product findLightestHeavyVanProduct() {
        for (Product product:products){
            if (product.getWeight()>20){
                return product;
            }
        }
        return products.last();
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
