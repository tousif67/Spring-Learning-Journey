package com.user.SpringBoot3.service;

import org.springframework.stereotype.Service;

@Service
public class FedEx implements IDelivery{
        public FedEx() {
            System.out.println("FedEx bean Created");
        }

    @Override
    public Boolean deliveryTheProduct(double amount) {
        System.out.println("Delivery done by FedEx and the total amount is " + amount);
        return true;
    }
}
