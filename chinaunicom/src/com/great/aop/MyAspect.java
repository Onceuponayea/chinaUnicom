package com.great.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@After("execution(* *.*(..))&&@annotation(com.great.aop.MyLog)")
	public void saveLog(JoinPoint joinPoint) throws NoSuchMethodException, SecurityException{
		Method method = joinPoint.getTarget().getClass().getMethod(joinPoint.getSignature().getName(), null);
		MyLog mg = method.getAnnotation(MyLog.class);
		System.out.println(mg.operation());
		System.out.println("日志记录！！！！");
	}
}
