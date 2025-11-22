package com.user.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("boot")
public class SpringBoot implements ICourse{

    public SpringBoot() {
        System.out.println("Springboot bean created");
    }
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Springboot course purchased successfully and amount paid is " + amount);
        return true;
    }
}
