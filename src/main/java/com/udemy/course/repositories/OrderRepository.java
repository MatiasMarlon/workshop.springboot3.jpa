package com.udemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.entities.Order;
import com.udemy.course.entities.User;

// Camada responsável por fazer operações com a entidade User.
public interface OrderRepository extends JpaRepository<Order, Long> {

}
