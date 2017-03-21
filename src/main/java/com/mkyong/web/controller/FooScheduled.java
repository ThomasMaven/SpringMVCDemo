package com.mkyong.web.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by ttomaka on 21.03.2017.
 */
@Service
public class FooScheduled {
    @Scheduled(fixedDelay = 1000)
    public void test() {
        System.out.println("Test!!!!");
    }
}
