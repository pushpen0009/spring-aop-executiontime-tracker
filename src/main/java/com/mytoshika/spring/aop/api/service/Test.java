package com.mytoshika.spring.aop.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mytoshika.spring.aop.api.advice.TrackExecutionTime;
import com.mytoshika.spring.aop.api.model.Product;

@Component
public class Test {

	@TrackExecutionTime
	public List<Product> display() {
		System.out.println("Display method is called");
		
		return new ArrayList<>();
	}
}
