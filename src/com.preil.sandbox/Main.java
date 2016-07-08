package com.preil.sandbox;

import java.io.IOException;

public class Main{
    public static void main(String[]args) throws IOException {
        System.out.println("Hello!");
        GeneralNomeclature gm1 = new GeneralNomeclature("Polyethylene");
        gm1.addAlias("Полиэтилен");
        gm1.addAlias("ПНД");
        gm1.addAttribute(new Attribute("М а р к а","Марка"));
        System.out.println(gm1.getName());
        System.out.println(gm1.getAttributes());
    }
}