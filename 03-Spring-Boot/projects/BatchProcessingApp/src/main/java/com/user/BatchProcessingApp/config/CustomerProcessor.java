package com.user.BatchProcessingApp.config;

import com.user.BatchProcessingApp.model.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer item) throws Exception {

        //logic to process(filter)
        return item;
    }
}
