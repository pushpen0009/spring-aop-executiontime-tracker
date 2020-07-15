package com.javatechie.spring.aop.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.spring.aop.api.advice.TrackExecutionTime;
import com.javatechie.spring.aop.api.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private Test test;

	@PostConstruct
	public void initDB() {
		List<Product> list=new ArrayList<>();
		for(int i=1;i<=10000;i++) {
			list.add(new Product(i, "product"+i, new Random().nextInt(2000)));
		}
	}
	
	@TrackExecutionTime
	public List<Product> addProduct(List<Product> products) {
		return new ArrayList<>();	
	}

	public List<Product> findAllProducts() {
		test.display();
		return new ArrayList<>();	
	}


}
