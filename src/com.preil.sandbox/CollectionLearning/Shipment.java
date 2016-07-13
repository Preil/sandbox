package com.preil.sandbox.CollectionLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Ilya 13.07.2016.
 */
public class Shipment implements Iterable<Product> {

    private static final int LIGHT_WEIGHT_MAX = 20;
    public static final int PRODUCT_NOT_PRESENT = -1;
    private final List<Product> products = new ArrayList<>();

    private List<Product> heavyVanProducts;
    private List<Product> lightVanProducts;

    public void add(Product product) {
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {
        final int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_PRESENT)
        {
        products.set(index,newProduct);
        }
    }
    public void prepare (){
        // sort our product by weight
        products.sort(Product.BY_WEIGHT);
        // find the product index that needs heavy van
        int splitPoint = findSplitPoint();
        // assign views of the product list for heavy and light van
        lightVanProducts = products.subList(0,splitPoint);
        heavyVanProducts = products.subList(splitPoint,products.size());
    }

    private int findSplitPoint() {
        for (int i = 0; i<products.size();i++) {
            final Product product = products.get(i);
            if (product.getWeight()>LIGHT_WEIGHT_MAX){
                return i;
            }
        }
        return 0;
    }

    public List<Product> getHeavyVanProducts(){
        return heavyVanProducts;
    }
    public List<Product> getLightVanProducts(){
        return lightVanProducts;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    @Override
    public void forEach(Consumer<? super Product> action) {

    }

    @Override
    public Spliterator<Product> spliterator() {
        return null;
    }

    @Override
    public String toString() {
        return
                "Shipment{" +
                "products=" + products +
                '}';
    }
}
