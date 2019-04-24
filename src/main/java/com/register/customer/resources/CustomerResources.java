package com.register.customer.resources;

import com.register.customer.domain.Customer;
import com.register.customer.service.CustomerService;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/customers")
public class CustomerResources {
    private final CustomerService customerService;

    @Autowired
    public CustomerResources(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Customer save(@RequestBody final Customer customer){

        return this.customerService.save(customer);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Customer update(@RequestBody final Customer customer){

        return this.customerService.save(customer);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Customer> findById(@PathVariable  final Long id){
        return this.customerService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> findAll(){
        return this.customerService.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody final Customer customer){

        this.customerService.delete(customer);
    }

}
