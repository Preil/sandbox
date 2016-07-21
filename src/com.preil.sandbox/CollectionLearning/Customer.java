package com.preil.sandbox.CollectionLearning;

/**
 * Ilya 19.07.2016.
 */
public class Customer {
    public static final Customer Jack = new Customer("Jack", "123-12-12");
    public static final Customer Jill = new Customer("Jill", "133-15-14");
    public static final Customer Marry = new Customer("Marry", "145-95-15");

    private String name;
    private String phone;
    public Customer (final String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    public void reply (final String message){
        System.out.printf("%s: %s\n", name, message);
    }

    public String getContacts() {
        String contacts = "Name: "+name + "\n Phone:" + phone;
        return contacts;

    }


}
