package com.mytoshika.spring.aop.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import com.mytoshika.spring.aop.api.advice.TrackExecutionTime;
import com.mytoshika.spring.aop.api.model.Product;

@Component
public class DemoService {

	@TrackExecutionTime
	public List<Product> display(String str) {
		System.out.println(str);
		
		if(str == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Str can not be null");
		}
		
		return new ArrayList<>();
	}
}
