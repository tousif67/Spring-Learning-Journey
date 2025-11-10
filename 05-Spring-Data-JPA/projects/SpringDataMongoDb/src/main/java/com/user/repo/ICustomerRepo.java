package com.user.repo;

import com.user.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICustomerRepo extends MongoRepository<Customer,String> {
}
