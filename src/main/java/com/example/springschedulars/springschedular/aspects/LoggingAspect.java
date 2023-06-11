package com.example.springschedulars.springschedular.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {

    @Before("com.example.springschedulars.springschedular.aspects.CommonPointCuts.logSchedularsPointCut()")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint) {

        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();

        StringBuilder sb = new StringBuilder(className);
        sb.append(".");
        sb.append(methodName);

        System.out.println(sb.toString());

    }
}
