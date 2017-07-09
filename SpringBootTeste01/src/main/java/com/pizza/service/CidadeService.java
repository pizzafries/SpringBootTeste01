package com.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.model.Cidade;
import com.pizza.model.Estado;
import com.pizza.repository.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	public Cidade findOne(Long id){
		return cidadeRepository.findOne(id);
	}
	public List<Cidade> findAll(){
		return cidadeRepository.findAll();
	}
	
	public List<Cidade> findByEstado(Estado estado){
		return cidadeRepository.findByEstado(estado);
	}
	
	public List<Cidade> findByNome(String nome){
		return cidadeRepository.findByNome(nome);
	}
	
	public Cidade save(Cidade cidade){
		return cidadeRepository.saveAndFlush(cidade);
	}
	
	public void delete(Long id){
		cidadeRepository.delete(id);
	}
}
