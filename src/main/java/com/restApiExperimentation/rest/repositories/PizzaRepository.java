package com.restApiExperimentation.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import com.restApiExperimentation.rest.models.Pizza;

public interface PizzaRepository extends CrudRepository<Pizza, Long> {
}
