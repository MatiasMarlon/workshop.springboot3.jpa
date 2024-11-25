package com.udemy.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.course.entities.User;
import com.udemy.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired // Injeção de dependência
	private UserRepository repository;
	
	// Método buscar todos os usuarios do banco de dados
	public List<User> findAll(){
		return repository.findAll();
	}
	
	// Buscar usuario por Id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
}
