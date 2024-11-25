package com.udemy.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.course.entities.Product;
import com.udemy.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired // Injeção de dependência
	private ProductRepository repository;
	
	// Método buscar todos os usuarios do banco de dados
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	// Buscar usuario por Id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}
}
