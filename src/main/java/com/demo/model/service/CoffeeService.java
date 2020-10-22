package com.demo.model.service;

import com.demo.model.domain.Coffee;
import com.demo.model.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Coffee> getAllCoffee(){
        return coffeeRepository.findAll();
    }

    public Coffee getCoffeeById(Long id){
        return coffeeRepository.findById(id).get();
    }

    public void saveCoffee (Coffee coffee){
        coffeeRepository.save(coffee);
    }

    public void update(Coffee coffee, int coffeeId){
        coffeeRepository.save(coffee);
    }

    public void delete(Long id){
        coffeeRepository.deleteById(id);
    }
}
