package com.preil.sandbox.Products;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[]args) throws IOException {
        System.out.println("Hello!");
        Product gm1 = new Product("Polyethylene");
        gm1.addAlias("Полиэтилен");
        gm1.addAlias("ПЭ");
        gm1.addAttribute(new Attribute("Марка ПЭ","Марка ПЭ"));
        gm1.addAttribute(new Attribute("Плотность тн/м3","Р,тн/м3"));
        gm1.addAttribute(new Attribute("Цвет","Цвет"));

        Product gm2 = new Product("Polyethylene");
        gm2.addAlias("Полипропилен");
        gm2.addAlias("ПП");
        gm2.addAttribute(new Attribute("Марка ПП","Марка ПП"));
        gm2.addAttribute(new Attribute("Плотность тн/м3"));
        gm2.addAttribute(new Attribute("Цвет","Цвет"));


        System.out.println(gm1.getName());
        System.out.println(gm1.getAttributes());

        List<Product> nomeclatureList = Arrays.asList(gm1, gm2);
        print(nomeclatureList);


    }
    public static <T extends Product> void print(List<T> list) {
        list.forEach(nlist -> System.out.println(nlist.toString()));
    }
}