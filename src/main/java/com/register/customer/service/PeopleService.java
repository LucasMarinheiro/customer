package com.register.customer.service;

import com.register.customer.domain.People;
import com.register.customer.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    public People save(final People people){

        return this.peopleRepository.save(people);

    }

    public Optional<People> findById(final Long id){

        return this.peopleRepository.findById(id);
    }

    public List<People> findAll(){

        return this.peopleRepository.findAll();
    }

    public void delete(final People people){

        this.peopleRepository.delete(people);

    }

    public People update(final People people){

        return this.peopleRepository.save(people);

    }

}
