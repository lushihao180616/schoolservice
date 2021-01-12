package com.lushihao.service.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyQuartz {

    @Scheduled(cron = "0 0 0 * * ?")
    public void test() {
    }

}
