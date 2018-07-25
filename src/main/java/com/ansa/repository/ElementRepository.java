package com.ansa.repository;

import com.ansa.entity.Element;
import org.springframework.data.hazelcast.repository.HazelcastRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementRepository extends HazelcastRepository<Element, String>{
}
