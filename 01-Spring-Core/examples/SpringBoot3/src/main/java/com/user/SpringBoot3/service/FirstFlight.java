package com.user.SpringBoot3.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FirstFlight implements IDelivery{

    public FirstFlight() {
        System.out.println("FirstFlight bean created");
    }

    @Override
    public Boolean deliveryTheProduct(double amount) {
        System.out.println("Delivery done by FirstFlight and the total amount is " + amount);
        return true;
    }
}
