package com.restApiExperimentation.rest.service;

import com.restApiExperimentation.rest.models.Pizza;
import com.restApiExperimentation.rest.repositories.PizzaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class PizzaService {
    private List<Pizza> pizzaList;

    private PizzaRepository pizzaRepository;

    public List<Pizza> createPizzaList() {
        if(pizzaList == null) {
            pizzaList = new ArrayList<>();
        }
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public List<Pizza> addPizza(Pizza pizza) {
        getPizzaList().add(pizza);
        return pizzaList;
    }

    public List<Pizza> printPizzas() {
        return getPizzaList();
    }

    @Transactional (propagation = Propagation.REQUIRED)
    public Pizza create(Pizza pizza) {
        return this.pizzaRepository.save(pizza);
    }

    @Transactional (propagation = Propagation.SUPPORTS)
    public List<Pizza> findAll() {
       List<Pizza> pizzaList = new ArrayList<Pizza>();
        pizzaRepository.findAll().forEach(pizzaList::add);


        return pizzaList;
    }
}
