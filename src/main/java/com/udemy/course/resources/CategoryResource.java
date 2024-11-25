package com.udemy.course.resources;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.course.entities.Category;
import com.udemy.course.service.CategoryService;

/* @RestController: Responsável por lidar com requisições HTTP. Indica que essa classe é um controlador REST.
*
* @RequestMapping(value = "/Categorys"): Define o caminho base (base path) para os endpoints da classe. Todas as requisições HTTP 
* que começarem com "/Categorys" serão direcionadas para os métodos dessa classe.
* 
* @GetMapping: Mapeia um método de um controlador para uma requisição HTTP GET. Ou seja, quando uma requisição HTTP GET for 
* feita para o endpoint especificado, esse método será executado.
*/

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired // Injeção de dependência
	private CategoryService service;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok(obj);

	}
}
