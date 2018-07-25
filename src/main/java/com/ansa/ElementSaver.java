package com.ansa;

import com.ansa.entity.Element;
import com.hazelcast.core.MapStore;

import java.util.Collection;
import java.util.Map;

public class ElementSaver implements MapStore<String, Element> {
    @Override
    public void store(String key, Element value) {
        System.out.println("ElementSaver.key = " + key);

    }

    @Override
    public void storeAll(Map<String, Element> map) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void deleteAll(Collection<String> keys) {

    }

    @Override
    public Element load(String key) {
        return null;
    }

    @Override
    public Map<String, Element> loadAll(Collection<String> keys) {
        return null;
    }

    @Override
    public Iterable<String> loadAllKeys() {
        return null;
    }
}
