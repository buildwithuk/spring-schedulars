package com.example.springschedulars.springschedular.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCuts {

    @Pointcut("@annotation(com.example.springschedulars.springschedular.aspects.LogSchedular)")
    public void logSchedularsPointCut() {
    }
}
