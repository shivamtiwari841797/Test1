package com.company;

import java.util.HashMap;
import java.util.Map;

public class MyStore<K, V> {
    private Map<K, V> romanNumerals = new HashMap<>();
    public void add(K key, V value) {
        romanNumerals.put(key, value);
    }
    public V get(K key) throws Exception {
        V v = romanNumerals.get(key);
        if(v == null)
            return (v)"Not Found!";
        return v;
    }
    public int getSize() {
        return romanNumerals.size();
    }
}
