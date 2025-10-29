package com.kodnest.SpringApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingService implements IGreeting{
    @Autowired
    private LocalTime time;

    public GreetingService() {
        System.out.println("GreetingService bean created");
    }


    @Override
    public String generateWish(String name) {
        int hour = time.getHour();
        if(hour < 12)
            return "Good Morning " + name;
        else if (hour < 16)
            return "Good Afternoon " + name;
        else if (hour < 20)
            return "Good Evening " + name;
        else
            return "Good Night " + name;

    }
}
