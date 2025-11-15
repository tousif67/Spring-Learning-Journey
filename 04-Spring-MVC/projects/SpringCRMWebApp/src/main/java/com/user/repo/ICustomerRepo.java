package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
