package com.preil.sandbox;

import java.util.UUID;

/**
 * Ilya 08.07.2016.
 */
public class Attribute {
    private String uuid;
    private String attributeFullName;
    private String attributeShortName;

    public Attribute(String fullName, String attributeShortName) {
        this.uuid = UUID.randomUUID().toString();
        this.attributeFullName = fullName;
        this.attributeShortName = attributeShortName;
    }

    public Attribute(String attributeName) {
    }

    public String getUuid() {
        return uuid;
    }

    public String getAttributeFullName() {

        return attributeFullName;
    }

    public void setAttributeFullName(String attributeFullName) {
        this.attributeFullName = attributeFullName;
    }

    public String getAttributeShortName() {
        return attributeShortName;
    }

    public void setAttributeShortName(String attributeShortName) {
        this.attributeShortName = attributeShortName;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "uuid='" + uuid + '\'' +
                ", attributeFullName='" + attributeFullName + '\'' +
                ", attributeShortName='" + attributeShortName + '\'' +
                '}';
    }
}
