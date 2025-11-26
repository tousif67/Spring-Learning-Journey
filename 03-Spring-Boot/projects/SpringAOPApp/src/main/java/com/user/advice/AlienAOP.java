package com.user.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Aspect
@Component
public class AlienAOP {

    @Before(value = "execution(* com.user.rest.AlienController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Request made to " + joinPoint.getSignature() + " at " + LocalTime.now());
    }

    @Before(value = "execution(* com.user.service.AlienService.*(..))")
    public void beforeAdviceService(JoinPoint joinPoint) {
        System.out.println("Request made to " + joinPoint.getSignature() + " at " + LocalTime.now());
    }

    @After(value = "execution(* com.user.rest.AlienController.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("Request made to " + joinPoint.getSignature() + " at " + LocalTime.now());
    }

    @After(value = "execution(* com.user.service.AlienService.*(..))")
    public void afterAdviceService(JoinPoint joinPoint) {
        System.out.println("Request made to " + joinPoint.getSignature() + " at " + LocalTime.now());
    }
}
