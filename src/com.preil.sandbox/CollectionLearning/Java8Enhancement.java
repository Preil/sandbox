package com.preil.sandbox.CollectionLearning;

import java.util.HashMap;
import java.util.Map;


/**
 * Ilya 28.07.2016.
 */
public class Java8Enhancement {
    public static void main(String[] args) {
        final Product defaultProduct = new Product(-1, "Whatever customer wants",100);
        final Map<Integer,Product> idToProduct = new HashMap<>();

        idToProduct.put(1,ProductFixtures.door);
        idToProduct.put(1,ProductFixtures.floorPanel);
        idToProduct.put(1,ProductFixtures.window);
// getOrDefault method example
        Product result = idToProduct.getOrDefault(10,defaultProduct);
        System.out.println(result);
        System.out.println(idToProduct.get(10));
        System.out.println();

// replace method example
        Product result2 = idToProduct.replace(1, new Product(1,"Big Door",50));
        System.out.println(result2);
        System.out.println(idToProduct.get(1));


    }


}
