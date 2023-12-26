package org.springframework.note;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author : qisi
 * @date: 2023/12/26
 * @description:
 */
@Aspect
@Component
public class NoteAopConfig {
	@Pointcut("execution(* org.springframework.note.NoteComponent.noteSecond())")
	public void testPointCut(){};
	@Around("testPointCut()")
	public void beanTest(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("around");
		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}
}
