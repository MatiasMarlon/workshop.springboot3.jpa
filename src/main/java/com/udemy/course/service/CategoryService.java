package com.udemy.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.course.entities.Category;
import com.udemy.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired 
	private CategoryRepository repository;


	public List<Category> findAll() {
		return repository.findAll();
	}

	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();

	}
}
