package com.gsau.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class sych2222 {
	    @Scheduled(cron="0 30 17 * * ?")
	    public void cronJob(){
	        System.out.println(" >>cron÷¥––....333333");
	    }

}
