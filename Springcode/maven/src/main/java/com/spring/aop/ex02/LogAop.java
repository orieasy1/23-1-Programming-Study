package com.spring.aop.ex02;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class LogAop {
	
	private final static Logger LOG = Logger.getGlobal();
	
	public void beforeLog(JoinPoint jp) {
		
		LOG.info(jp.getSignature().getName() + " 메소드 시작!");
		
		// getSignature : 호출되는 메소드에 대한 정보를 얻는다.
		// getName : 메소드의 이름을 얻는다.
		
	}
	
	public void afterLog(JoinPoint jp) {
		
		LOG.info(jp.getSignature().getName() + " 메소드 끝!");
		
	}
	
	public Object aroundAop(ProceedingJoinPoint joinPoint) throws Throwable{
		
		long start = System.nanoTime();
		// 현재 시스템의 시간으로 나노세컨드 값을 long 으로 반환
		
		try {
			
			Object obj = joinPoint.proceed(); // 핵심기능 실행
			// proceed 메소드를 호출하면 타겟(핵심기능) 메소드가 동작한다.
			
			return obj;
			
		}finally {
			
			long end = System.nanoTime();
			
			System.out.println("메소드 걸린시간 : " + (end - start) + "ns");
			
		}
		
	}
	
}












