package com.ansa;

import com.ansa.entity.Task;
import com.hazelcast.core.MapStore;

import java.util.Collection;
import java.util.Map;

public class TaskSaver implements MapStore<String, Task> {
    @Override
    public void store(String key, Task value) {
        System.out.println("TaskSaver.key = " + key);

    }

    @Override
    public void storeAll(Map<String, Task> map) {

    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void deleteAll(Collection<String> keys) {

    }

    @Override
    public Task load(String key) {
        return null;
    }

    @Override
    public Map<String, Task> loadAll(Collection<String> keys) {
        return null;
    }

    @Override
    public Iterable<String> loadAllKeys() {
        return null;
    }
}
