package com.ansa;

import com.ansa.config.RootConfiguration;
import com.ansa.entity.Element;
import com.ansa.entity.Task;
import com.ansa.repository.ElementRepository;
import com.ansa.repository.TaskRepository;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfiguration.class);

        HazelcastInstance hz = context.getBean(HazelcastInstance.class);


        ElementRepository elementRepository = context.getBean(ElementRepository.class);

        TaskRepository taskRepository = context.getBean(TaskRepository.class);

        elementRepository.save(new Element("tests"));

        taskRepository.save(new Task("task"));

    }
}
