package com.demo.api.v2.controller;

import com.demo.model.domain.Coffee;
import com.demo.model.service.CoffeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v2/coffee")
public class CoffeeController {
    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping("/")
    public List<Coffee> getAllCoffee(){
        return  coffeeService.getAllCoffee();
    }

    @PostMapping("/")
    public Long create(@RequestBody Coffee coffee){
        coffeeService.saveCoffee(coffee);
        return coffee.getId();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") Long id, Coffee coffee){
        coffeeService.delete(id);
    }

    @PutMapping("/")
    private Coffee update(@RequestBody Coffee coffee){
        coffeeService.saveCoffee(coffee);
        return coffee;
    }

}
