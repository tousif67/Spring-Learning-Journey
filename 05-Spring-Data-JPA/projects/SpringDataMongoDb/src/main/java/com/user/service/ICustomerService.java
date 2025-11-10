package com.user.service;

import com.user.dto.CustomerDTO;
import com.user.model.Customer;

import java.util.List;

public interface ICustomerService {
    public String registerCustomer(CustomerDTO dto);
    public List<Customer> findAllCustomers();
    public String removeDocument(String id);
}
