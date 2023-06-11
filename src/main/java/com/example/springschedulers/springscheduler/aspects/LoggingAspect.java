package com.example.springschedulers.springscheduler.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {

    /*
     * This method is executed when the scheduler is to be executed. 
     * It will log the scheduler about to be executed.
     */
    @Before("com.example.springschedulers.springscheduler.aspects.CommonPointCuts.logSchedulersPointCut()")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint) {

        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();

        StringBuilder sb = new StringBuilder(className);
        sb.append(".");
        sb.append(methodName);
        
        System.out.println("Starting scheduler: " + sb.toString());

    }
}
