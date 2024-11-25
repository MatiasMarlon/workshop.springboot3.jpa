package com.udemy.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.course.entities.Order;
import com.udemy.course.entities.Order;
import com.udemy.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired // Injeção de dependência
	private OrderRepository repository;
	
	// Método buscar todos os usuarios do banco de dados
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	// Buscar usuario por Id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}
}
