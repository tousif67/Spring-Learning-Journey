package com.user.service;

import com.user.dto.CustomerDTO;
import com.user.model.Customer;
import com.user.repo.ICustomerRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepo repo;


    @Override
    public String registerCustomer(CustomerDTO dto) {
        Customer cx = new Customer();
        BeanUtils.copyProperties(dto,cx);
        Customer cxDoc = repo.save(cx);
        return "Customer Info Stored with Id " + cxDoc.getId();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return repo.findAll();
    }

    @Override
    public String removeDocument(String id) {
          Optional optional = repo.findById(id);
          if(optional.isPresent()) {
              repo.deleteById(id);
              return "Customer Doc deleted with id " + id;
          }
        return "Customer Doc not found with id " + id + " to be deleted";
    }
}
