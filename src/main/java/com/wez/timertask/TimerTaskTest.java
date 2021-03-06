package com.wez.timertask;


import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Lazy(value=false)
@Component
public class TimerTaskTest {

    @Scheduled(cron = "0/2 * *  * * ? ")
    public void test() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
