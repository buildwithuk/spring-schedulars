package com.example.springschedulars.springschedular.schedular;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.springschedulars.springschedular.aspects.LogSchedular;

@Configuration
@EnableScheduling
public class MidNightSchedular {

    @LogSchedular
    @Scheduled(fixedDelay = 5000)
    public void runSchedule() {
        System.out.println("Running");
    }

}
