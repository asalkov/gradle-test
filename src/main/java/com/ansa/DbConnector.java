package com.ansa;

import com.ansa.entity.Element;
import com.ansa.entity.Task;
import com.hazelcast.config.MapStoreConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class DbConnector {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();

        hz.getConfig().getMapConfig("element")
                .setMapStoreConfig(new MapStoreConfig().setImplementation(new ElementSaver()));

        hz.getConfig().getMapConfig("task")
                .setMapStoreConfig(new MapStoreConfig().setImplementation(new TaskSaver()));


        System.out.println("Save");

        hz.getMap("element").put("1", new Element("dara"));

        hz.getMap("task").put("1", new Task("value"));

        int mapSize = hz.getMap("element").size();

        System.out.println(mapSize);
    }
}
