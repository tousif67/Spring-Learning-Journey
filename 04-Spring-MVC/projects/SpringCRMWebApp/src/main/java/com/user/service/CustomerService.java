package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.Customer;
import com.user.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	private ICustomerRepo repo;

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
		
	}

	@Override
	public void registerCustomer(Customer customer) {
		repo.save(customer);
		
	}

	@Override
	public Customer fetchCxById(Integer id) {
		Optional<Customer> optional = repo.findById(id);
		return optional.get();
	}

	@Override
	public void deleteCustomerById(Integer id) {
		repo.deleteById(id);
		
	}
	
	

}
