package com.spring.aop.ex03;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	private final static Logger LOG = Logger.getGlobal();
	
	@Pointcut("execution(* com.spring.aop.ex03.Bank.*(..))")
	// 모든 리턴타입의 com.spring.aop.ex03 패키지에 있는 Bank 클래스의 모든 메소드
	private void pointCutMethod() {}
	// 포인트컷 식별용으로 사용하기 위해 구현 로직이 없는 (내부가 비어있는)
	// 메소드를 만들어서 어노테이션을 사용한다.
	
	// @Before("식별용 메소드 명시")
	@Before("pointCutMethod()")
	public void beforeLog(JoinPoint jp) {
		
		LOG.info(jp.getSignature().getName() + " 메소드 시작!");
		
	}
	
	@After("pointCutMethod()")
	public void afterLog(JoinPoint jp) {
		
		LOG.info(jp.getSignature().getName() + " 메소드 끝!");
		
	}
	
	@Around("pointCutMethod()")
	public Object aroundAop(ProceedingJoinPoint joinPoint) throws Throwable{
		
		long start = System.nanoTime();
		
		try {
			
			Object obj = joinPoint.proceed(); // 핵심기능 실행
			
			return obj;
			
		}finally {
			
			long end = System.nanoTime();
			
			System.out.println("메소드 걸린시간 : " + (end - start) + "ns");
			
		}
		
	}
	
	
	
}
