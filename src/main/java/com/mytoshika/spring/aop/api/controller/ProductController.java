package com.mytoshika.spring.aop.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mytoshika.spring.aop.api.model.Product;
import com.mytoshika.spring.aop.api.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;


	@PostMapping("/save")
	public List<Product> saveProducts(@RequestBody List<Product> products) {

		List<Product> pList = service.addProduct(products);

		return pList;
	}

	@GetMapping("/findProducts")
	public List<Product> getProducts() {
		
		List<Product> products = service.findAllProducts();
	
		return products;
	}

}
