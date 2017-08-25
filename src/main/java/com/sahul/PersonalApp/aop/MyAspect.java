package com.sahul.PersonalApp.aop;

import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MyAspect {

	protected final Log logger = LogFactory.getLog(getClass()); 
	
	@Before("execution(* com.sahul.PersonalApp.controller.SiteController.*(..))")
	public void doSomething(JoinPoint jp) {
		logger.info("Before the execution of function " + jp.getSignature().getName() + "()");
		logger.info("Was passed arguments " + Arrays.toString(jp.getArgs()));
	}
	
	@AfterReturning(pointcut = "execution(* com.sahul.PersonalApp.controller.SiteController.*(..))",
			returning="result")
	public void doSomethingElse(JoinPoint jp,Object result) {
		logger.info("Finished processing the function " + jp.getSignature().getName() + "()");
		logger.info("Loading the " + result.toString() + " page for the user");
	}
}
