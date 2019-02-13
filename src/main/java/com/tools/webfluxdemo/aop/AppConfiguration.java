package com.tools.webfluxdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@Aspect
public class AppConfiguration {
	
 
	private static final Logger LOGGER = LoggerFactory.getLogger(AppConfiguration.class);
	
	
	/**
	 * The below point cut expression run for all methods in HelloController Class.
	 */
	@Before("execution(* com.tools.webfluxdemo.hello.HelloController.*(..) )")
	public void beforeExecOfaMethod(JoinPoint joinPoint) {
		LOGGER.info("Before executing controller method..");
		String className = joinPoint.getSignature().getDeclaringTypeName();
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		
		LOGGER.info("Class name {} and Method is {} and Arguments are {}",className, methodName, args );
	}
	
	/**
	 * The below point cut expression runs for all methods inside a webfluxdemo package.
	 */
	/*
	 * @After("execution(* com.tools.webfluxdemo..*.*(..))") public void
	 * afterExecOfaMethod(JoinPoint joinpoint) {
	 * LOGGER.info("com.tools.webfluxdemo method is done executing.."); }
	 */
	@AfterReturning(pointcut = "execution(* com.tools.webfluxdemo..*.*(..))", returning="result")
	public void afterExecOfaMethod(JoinPoint joinPoint, Object result) {
		LOGGER.info(" ###### Returning for class : {} ; Method : {} ", joinPoint.getTarget().getClass().getName(), joinPoint.getSignature().getName());
	    if (result != null) {
	    	LOGGER.info(" ###### with value : {}", result);
	    } else{
	    	LOGGER.info(" ###### with null as return value.");
	    }
	}
	
	@Pointcut("execution(* com.tools.webfluxdemo.hello.HelloController.*(..))")
	public void calculateTime() {}
	
	
	@Around("calculateTime()")
	public Object aroundExecOfaMethod(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		LOGGER.info("Going to call the method. "+pjp.toLongString());
		Object output =  pjp.proceed();
		
		long elapsedTime = System.currentTimeMillis() - start;
		
		LOGGER.info("Method Execution time: "+elapsedTime + " Milliseconds");
		return output;
	}
	
}
