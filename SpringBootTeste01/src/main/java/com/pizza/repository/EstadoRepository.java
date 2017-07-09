package com.pizza.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pizza.model.Estado;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long>{

}
