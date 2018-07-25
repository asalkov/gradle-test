package com.ansa.config;


import com.hazelcast.core.HazelcastInstance;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration

@Import(value = {
        HazelcastConfiguration.class
})
public class RootConfiguration {
}
