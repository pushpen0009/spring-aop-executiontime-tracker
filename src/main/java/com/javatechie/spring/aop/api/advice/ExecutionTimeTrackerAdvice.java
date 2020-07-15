package com.javatechie.spring.aop.api.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeTrackerAdvice {
	
	Logger logger=LoggerFactory.getLogger(ExecutionTimeTrackerAdvice.class);
	
	@Around("@annotation(com.javatechie.spring.aop.api.advice.TrackExecutionTime)")
	public Object trackTime(ProceedingJoinPoint pjp) throws Throwable {
		long stratTime=System.currentTimeMillis();
		logger.info("Start:: Method name"+pjp.getSignature());
		Object obj=pjp.proceed();
		long endTime=System.currentTimeMillis();
		logger.info("END:: Method name"+pjp.getSignature()+" time taken to execute : "+(endTime-stratTime));
		return obj;
	}

}
