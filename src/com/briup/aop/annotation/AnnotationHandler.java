package com.briup.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/*切面类,这里包含了多个切面方法,可以把每个切面方法织入到不同切入点的不同位置*/
/*类--->spring容器中的bean--->切面类*/

public class AnnotationHandler {
	
	public void beforeTest(JoinPoint p){
		System.out.println(p.getSignature().getName()+" before...");
	}
	
	public void afterTest(JoinPoint p){
		System.out.println(p.getSignature().getName()+" after...");
	}
	
	public void afterReturningTest(JoinPoint p){
		System.out.println(p.getSignature().getName()+" afterReturning");
	}
	
	public Object aroundTest(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println(pjp.getSignature().getName()+" is start..");
		
		Object obj = pjp.proceed();
		
		System.out.println(pjp.getSignature().getName()+" is end..");
		return obj;
	}
	
	public void throwingTest(JoinPoint p,Exception ex){
		System.out.println(p.getSignature().getName()+" is throwing..."+ex.getMessage());
	}
}
