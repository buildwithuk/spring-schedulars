package com.example.springschedulers.springscheduler.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCuts {

    @Pointcut("@annotation(com.example.springschedulers.springscheduler.aspects.LogScheduler)")
    public void logSchedulersPointCut() {
    }
}
