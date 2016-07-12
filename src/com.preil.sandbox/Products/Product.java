package com.preil.sandbox.Products;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * Ilya 08.07.2016.
 */
public class Product {
    private String uuid;
    private String name;
    private List<String> alias = new ArrayList<>();
    private List<Attribute> attributes = new LinkedList<>();
    private List<OrgProduct> orgProducts = new ArrayList<>();

    public Product(String name) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
    }
    public void addAlias (String aliasName){
        alias.add(aliasName);
    }
    public void addAttribute (Attribute attribute){
        attributes.add(attribute);
    }


    @Override
    public String toString() {
        return "GeneralNomeclature{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", alias=" + alias +
                ", attributes=" + attributes +
                '}';
    }

    public String getName() {
        return name+"; "+alias.toString();
    }

    public String getAttributes() {
        return attributes.toString();
    }
}
