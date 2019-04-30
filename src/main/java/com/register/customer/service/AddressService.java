package com.register.customer.service;

import com.register.customer.domain.Address;
import com.register.customer.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    public Address save(final Address address){

        return this.addressRepository.save(address);

    }

    public Optional<Address> findById(final Long id){

        return this.addressRepository.findById(id);
    }

    public List<Address> findAll(){

        return this.addressRepository.findAll();
    }

    public void delete(final Address typeAddress){

        this.addressRepository.delete(typeAddress);

    }

    public Address update(final Address typeAddress){

        return this.addressRepository.save(typeAddress);

    }

}