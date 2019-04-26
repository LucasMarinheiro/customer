package com.register.customer.resources;

import com.register.customer.domain.Adress;
import com.register.customer.domain.Customer;
import com.register.customer.service.AdressService;
import com.register.customer.service.CustomerService;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/adress")
public class AdressResources {
    private final AdressService adressService;

    @Autowired
    public AdressResources(AdressService adressService) {
        this.adressService = adressService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Adress save(@RequestBody final Adress adress){

        return this.adressService.save(adress);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Adress update(@RequestBody final Adress adress){

        return this.adressService.save(adress);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Adress> findById(@PathVariable  final Long id){
        return this.adressService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Adress> findAll(){
        return this.adressService.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody final Adress adress){

        this.adressService.delete(adress);
    }

}
