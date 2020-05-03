package com.restApiExperimentation.rest.controllers;

import com.restApiExperimentation.rest.models.Pizza;
import com.restApiExperimentation.rest.service.PizzaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Cashier {

    @GetMapping("/pizzas")
    public List<Pizza> getPizzas() {

        PizzaService pizzaService = new PizzaService();

        return pizzaService.findAll();

    }

}
