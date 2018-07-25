package com.ansa.repository;

import com.ansa.entity.Task;
import org.springframework.data.hazelcast.repository.HazelcastRepository;

public interface TaskRepository extends HazelcastRepository<Task, String>{
}
