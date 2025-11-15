package com.user.service;

import java.util.List;

import com.user.model.Customer;

public interface ICustomerService {

	public List<Customer> getAllCustomers();
	
	public void registerCustomer(Customer customer);
	
	public Customer fetchCxById(Integer id);
	
	public void deleteCustomerById(Integer id);

}
