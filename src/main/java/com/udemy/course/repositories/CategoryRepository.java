package com.udemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.entities.Category;
import com.udemy.course.entities.User;

// Camada responsável por fazer operações com a entidade User.
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
