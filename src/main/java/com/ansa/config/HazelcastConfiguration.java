package com.ansa.config;


import com.ansa.ElementSaver;
import com.ansa.TaskSaver;
import com.hazelcast.config.MapStoreConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.hazelcast.repository.config.EnableHazelcastRepositories;

@Configuration
@EnableHazelcastRepositories(value = {
        "com.ansa.repository"
})
public class HazelcastConfiguration {
    @Bean
    public HazelcastInstance hazelcastInstance(){
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();

        hz.getConfig().getMapConfig("element")
                .setMapStoreConfig(new MapStoreConfig().setImplementation(new ElementSaver()));

        hz.getConfig().getMapConfig("task")
                .setMapStoreConfig(new MapStoreConfig().setImplementation(new TaskSaver()));

        return hz;
    }
}
