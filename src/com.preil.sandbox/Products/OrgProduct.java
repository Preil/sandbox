package com.preil.sandbox.Products;

import java.util.HashMap;
import java.util.Map;

/**
 * Ilya 08.07.2016.
 */
public class OrgProduct {
    public int uuid;
    private Product generalNomeclature;
    public String generalNomenclatureUuid;
    private Map<Attribute, String> atributesValues = new HashMap<>();
}

