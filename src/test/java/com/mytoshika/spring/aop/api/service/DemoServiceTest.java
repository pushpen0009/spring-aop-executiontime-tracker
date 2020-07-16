package com.mytoshika.spring.aop.api.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class DemoServiceTest {

	@InjectMocks
	DemoService demoService;
	
	@Test
	public void displayTestWithException() {
		
		Assertions.assertThrows(ResponseStatusException.class, () -> {demoService.display(null);});
	}
	
	@Test
	public void displayTest() {
	
		Assertions.assertEquals(0, demoService.display("").size());
	}
}
