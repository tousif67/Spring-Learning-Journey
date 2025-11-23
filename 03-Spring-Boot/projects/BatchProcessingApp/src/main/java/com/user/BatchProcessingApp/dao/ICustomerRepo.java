package com.user.BatchProcessingApp.dao;

import com.user.BatchProcessingApp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer,Integer> {
}
