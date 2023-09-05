package com.ptcodes.qurmo.entity;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class CommonFieldsMap {

    Map<String, String> fields = new HashMap<>();

    public void saveFields(String key, String value) {

        fields.put(key, value);
    }

    public Map<String, String> commonFields() {

        System.out.println("common fields size => " + fields.size());
        return fields;
    }
}


