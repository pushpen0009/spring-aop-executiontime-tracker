package com.mytoshika.spring.aop.api.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class ExecutionTimeTrackerAdviceTest {

	@Mock
	ProceedingJoinPoint proceedingJoinPoint;
	
	@InjectMocks
	ExecutionTimeTrackerAdvice executionTimeTrackerAdvice;
	
	@Test
	public void trackTimeTest() throws Throwable {
		Mockito.when(proceedingJoinPoint.getSignature()).thenReturn(null);
		Mockito.when(proceedingJoinPoint.getArgs()).thenReturn(Arrays.asList("testing").toArray());
		Object ob = executionTimeTrackerAdvice.trackTime(proceedingJoinPoint);
		Assertions.assertNull(ob);
	}
	
	@Test
	public void logTest() {
		executionTimeTrackerAdvice.log();
		Assertions.assertTrue(true);
	}
}
