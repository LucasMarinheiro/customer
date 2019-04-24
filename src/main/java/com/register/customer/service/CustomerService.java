package com.register.customer.service;

import com.register.customer.domain.Customer;
import com.register.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public Customer save(final Customer customer){

        return this.customerRepository.save(customer);

    }

    public Optional<Customer> findById(final Long id){

        return this.customerRepository.findById(id);
    }

    public List<Customer> findAll(){

        return this.customerRepository.findAll();
    }

    public void delete(final Customer customer){

        this.customerRepository.delete(customer);

    }

    public Customer update(final Customer customer){

        return this.customerRepository.save(customer);

    }

}
