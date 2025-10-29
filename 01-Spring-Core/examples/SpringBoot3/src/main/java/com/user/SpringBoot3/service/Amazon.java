package com.user.SpringBoot3.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Amazon
{
    private IDelivery service;
    public Amazon(IDelivery service) {
        System.out.println("Amazon bean created");
        this.service = service;
    }
//    @Qualifier("fedEx")
//    public void setService(IDelivery service) {
//        this.service = service;
//    }

    public Boolean deliverProduct(double amount) {
        return service.deliveryTheProduct(amount);
    }
}
