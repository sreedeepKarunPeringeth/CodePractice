package com.springAOP.AOPDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//Pointcut
	//Weaving and weaver
	/*@AfterReturning(value="execution(* com.springAOP.AOPDemo.data.*.*(..))",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result){
		//Advice
		logger.info("returned {} with value {}", joinPoint,result);
	}
	*/
	@AfterThrowing(value="execution(* com.springAOP.AOPDemo.data.*.*(..))",throwing="exception")
	public void afterThrowing(JoinPoint joinPoint,Exception result){
		//Advice
		logger.info("returned {} with value {}", joinPoint,result);
	}
	
	/*@After(value="execution(* com.springAOP.AOPDemo.data.*.*(..))")
	public void after(JoinPoint joinPoint){
		//Advice
		logger.info("returned {} with value {}", joinPoint);
	}*/
	
}
