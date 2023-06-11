package com.example.springschedulers.springscheduler.scheduler;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.springschedulers.springscheduler.aspects.LogScheduler;

@Configuration
@EnableScheduling
public class MidNightScheduler {

    // Calling the scheduler to log the execution
    @LogScheduler
    // Scheduled to be executed at the midnight
    // The timezone comes from the application.properties
    // Depending upon the region, timezone can be changed as desired
    @Scheduled(cron="0 0 0 * * *", zone="${timezone}") 
    public void runSchedule() {
        
        /*
         * Some code here that mimics actual application logic
         * 
         */

        System.out.println("Scheduled job running");

    }

}




//    @LogSchedular

