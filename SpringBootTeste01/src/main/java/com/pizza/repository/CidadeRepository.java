package com.pizza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizza.model.Cidade;
import com.pizza.model.Estado;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long>{

	List<Cidade> findByEstado(Estado estado);
	
	List<Cidade> findByNome(String nome);
}
