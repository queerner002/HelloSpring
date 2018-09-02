package com.java.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/8/24 0024.
 */
public class TimeHandler {
    private long startTime = 0;
    private long endTime = 0;

    public void before() {
        startTime = new Date().getTime();
        System.out.println("Start Time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTime) + ".");
    }

    public void after() {
        endTime = new Date().getTime();
        System.out.println("End Time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(endTime) + ".");
        long costTime = endTime - startTime;
        System.out.println("Total Cost Time: " + (costTime / 1000.0) + "s.");
    }

}
