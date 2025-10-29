package com.user.SpringBoot2.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    static
    {
        System.out.println("Static block of Alien Bean");
    }

    {
        System.out.println("Instance block of Alien Bean");
    }

    public Alien() {
        System.out.println("Alien Bean created");
    }
    @PostConstruct //It will get automatically invoked after the constructor creation
    public void init() {
        System.out.println("Init method of Alien");
    }

    public void disp() {
        System.out.println("Method of Alien bean");
    }
    @PreDestroy  //It will get automatically invoked before IOC Container is closed i.e (container.close() in the main java file        )
    public void destroy() {
        System.out.println("Bean destroyed");
    }
}
