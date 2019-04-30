package com.register.customer.resources;

import com.register.customer.domain.Address;
import com.register.customer.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/address")
public class AddressResources {
    private final AddressService addressService;

    @Autowired
    public AddressResources(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Address save(@RequestBody final Address address){

        return this.addressService.save(address);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Address update(@RequestBody final Address address){

        return this.addressService.save(address);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Address> findById(@PathVariable  final Long id){
        return this.addressService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Address> findAll(){
        return this.addressService.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody final Address address){

        this.addressService.delete(address);
    }

}
