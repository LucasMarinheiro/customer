package com.register.customer.resources;

import com.register.customer.domain.TypeAddress;
import com.register.customer.service.TypeAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/typeaddress")
public class TypeAddressResources {
    private final TypeAddressService typeAddressService;

    @Autowired
    public TypeAddressResources(TypeAddressService typeAddressService) {
        this.typeAddressService = typeAddressService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public TypeAddress save(@RequestBody final TypeAddress typeAddress){

        return this.typeAddressService.save(typeAddress);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public TypeAddress update(@RequestBody final TypeAddress typeAddress){

        return this.typeAddressService.save(typeAddress);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<TypeAddress> findById(@PathVariable  final Long id){
        return this.typeAddressService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<TypeAddress> findAll(){
        return this.typeAddressService.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody final TypeAddress typeAddress){

        this.typeAddressService.delete(typeAddress);
    }

}
