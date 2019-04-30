package com.register.customer.service;

import com.register.customer.domain.TypeAddress;
import com.register.customer.repository.TypeAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeAddressService {
    private final TypeAddressRepository typeAddressRepository;

    @Autowired
    public TypeAddressService(TypeAddressRepository typeAddressRepository) {
        this.typeAddressRepository = typeAddressRepository;
    }
    public TypeAddress save(final TypeAddress typeAddress){

        return this.typeAddressRepository.save(typeAddress);

    }

    public Optional<TypeAddress> findById(final Long id){

        return this.typeAddressRepository.findById(id);
    }

    public List<TypeAddress> findAll(){

        return this.typeAddressRepository.findAll();
    }

    public void delete(final TypeAddress typeAddress){

        this.typeAddressRepository.delete(typeAddress);

    }

    public TypeAddress update(final TypeAddress typeAddress){

        return this.typeAddressRepository.save(typeAddress);

    }

}