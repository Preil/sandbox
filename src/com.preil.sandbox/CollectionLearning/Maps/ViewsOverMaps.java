package com.preil.sandbox.CollectionLearning.Maps;

import com.preil.sandbox.CollectionLearning.QueueTrainings.Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Ilya 22.07.2016.
 */
public class ViewsOverMaps {

    public static void main(String[] args) {
        final Map<Integer,Product> idToProduct = new HashMap<>();
        idToProduct.put(1, Product.radio);
        idToProduct.put(2, Product.tvset);
        idToProduct.put(3, Product.fridge);
        idToProduct.put(4, Product.fridge);

        System.out.println(idToProduct);
        System.out.println();

        final Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);
        System.out.println();

        System.out.println("Removing key element - removing value:");
        //ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProduct);
        System.out.println();

        final Set<Product> products = new HashSet<>();
        products.addAll(idToProduct.values());
        System.out.println("Set of products: "+products);

        System.out.println("Removing value form value's collection - removing record from Map:");
        //products.remove(Product.tvset);
        System.out.println(ids);
        System.out.println(products);
        System.out.println(idToProduct);
        System.out.println();

        final Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();

        for (Map.Entry<Integer, Product> entry : entries){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            // to update an entry value:
            entry.setValue(Product.radio);

        }

    }
}
