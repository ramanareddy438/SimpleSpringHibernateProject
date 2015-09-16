package com.razorfish.sample.aspect;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	/**
	 * This method will be executed after the ActorServiceImpl.getActors() method completed and intercepts the result as well. 
	 * @param joinPoint
	 * @param result
	 */
	@AfterReturning(pointcut="execution(* ActorServiceImpl.getActors(..)")
	public void logAfterReturningV1(JoinPoint joinPoint, Object result) {
		log.debug("After Returning the result and also to intercept the result v1 method :" + joinPoint.getSignature().getName());
		log.debug("Method Returned value is :" + result);
	}
	
	/**
	 * This method will be executed after any method of ActorServiceImpl class are completed and intercepts the result as well.
	 * @param joinPoint
	 * @param result
	 */
	@AfterReturning(pointcut="execution(* ActorServiceImpl.*(..)")
	public void logAfterReturningV2(JoinPoint joinPoint, Object result) {
		log.debug("After Returning the result and also to intercept the result v2 method :" + joinPoint.getSignature().getName());
		log.debug("Method returned value :" + result);
	}
	
	/**
	 * This method will be executed if the ActorServiceImpl.getActors() method throws any exception
	 * @param joinPoint
	 * @param err
	 */
	@AfterThrowing(pointcut="execution(* ActorServiceImpl.getActors(..)")
	public void logAfterThrowingV1(JoinPoint joinPoint, Throwable err) {
		log.debug("After throwing exception v1 method :" + joinPoint.getSignature().getName());
		log.debug("Method thrown exception :" + err.getMessage());
	}
	
	/**
	 * This method will be executed if any of the ActorServiceImpl method throws any exception
	 * @param joinPoint
	 * @param err
	 */
	@AfterThrowing("execution(* ActorServiceImpl.*(..)")
	public void logAfterThrowingV2(JoinPoint joinPoint, Throwable err) {
		log.debug("After throwing exception v2 method :" + joinPoint.getSignature().getName());
		log.debug("Method thrown exception :" + err.getMessage());
	}
	
	@Around("execution(* ActorServiceImpl.getActors(..)")
	public void logAroundV1(ProceedingJoinPoint joinPoint) {
		log.debug("method Around v1 method :" + joinPoint.getSignature().getName());
	}
	
	@Around("execution(* ActorServiceImpl.*(..)")
	public void logAroundV2(ProceedingJoinPoint joinPoint) {
		log.debug("Method Around v2 :" + joinPoint);
	}
}
