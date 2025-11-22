package com.user.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("devops")
public class Devops implements ICourse{

    public Devops() {
        System.out.println("Devops bean created");
    }

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Devops course purchased successfully and amount paid is " + amount);
        return true;
    }
}
