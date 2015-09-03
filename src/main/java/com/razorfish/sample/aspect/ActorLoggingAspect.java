package com.razorfish.sample.aspect;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ActorLoggingAspect {
	
	Logger log = LogManager.getLogger(ActorLoggingAspect.class);
	
	/**
	 * This method will be called just before when getActors() called
	 * @param joinPoint
	 */
	@Before("execution(* ActorServiceImpl.getActors(..)")
	public void logBeforeV1(JoinPoint joinPoint) {
		log.debug("Before executing v1 method :" + joinPoint.getSignature().getName());
	}
	
	/**
	 * This method will be executed just before when any method of ActorServiceImpl are called
	 * @param joinPoint
	 */
	@Before("execution(* ActorServiceImpl.*(..)")
	public void logBeforeV2(JoinPoint joinPoint) {
		log.debug("Before executing v2 method :" + joinPoint.getSignature().getName());
	}
	
	/**
	 * This method will be called just after the ActorServiceImpl.getActors() method completed
	 * @param joinPoint
	 */
	@After("execution(* ActorServiceImpl.getActors(..)")
	public void logAfterV1(JoinPoint joinPoint) {
		log.debug("After executing v1 method :" + joinPoint.getSignature().getName());
	}
	
	/**
	 * This method will be called just after any method of ActorServiceImpl class are completed
	 * @param joinPoint
	 */
	@After("execution(* ActorServiceImpl.*(..)")
	public void logAfterV2(JoinPoint joinPoint) {
		log.debug("After executing v2 method :" + joinPoint.getSignature().getName());
	}
	
	@AfterReturning
	public void logAfterReturning() {
		
	}
}
