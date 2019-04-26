package com.register.customer.service;

import com.register.customer.domain.Adress;
import com.register.customer.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdressService {
    private final AdressRepository adressRepository;

    @Autowired
    public AdressService(AdressRepository adressRepository) {
        this.adressRepository = adressRepository;
    }
    public Adress save(final Adress adress){

        return this.adressRepository.save(adress);

    }

    public Optional<Adress> findById(final Long id){

        return this.adressRepository.findById(id);
    }

    public List<Adress> findAll(){

        return this.adressRepository.findAll();
    }

    public void delete(final Adress adress){

        this.adressRepository.delete(adress);

    }

    public Adress update(final Adress adress){

        return this.adressRepository.save(adress);

    }

}