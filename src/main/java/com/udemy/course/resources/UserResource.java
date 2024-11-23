package com.udemy.course.resources;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.course.entities.User;

/* @RestController: Responsável por lidar com requisições HTTP e retornar respostas, geralmente no formato JSON.
*
* @RequestMapping(value = "/users"): Define o caminho base (base path) para os endpoints da classe. Todas as requisições HTTP 
* que começarem com "/users" serão direcionadas para os métodos dessa classe.
* 
* @GetMapping: Mapeia um método de um controlador para uma requisição HTTP GET. Ou seja, quando uma requisição HTTP GET for 
* feita para o endpoint especificado, esse método será executado.
*/

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1l, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(user);
	}
}
