package com.demo.model.repository;

import com.demo.model.domain.Coffee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, Long> {
    Coffee findAllByProductName(String name);
    List<Coffee> findAll();
}
