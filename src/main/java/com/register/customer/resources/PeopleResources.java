package com.register.customer.resources;

import com.register.customer.domain.Customer;
import com.register.customer.domain.People;
import com.register.customer.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/peoples")
public class PeopleResources {
    private final PeopleService peopleService;

    @Autowired
    public PeopleResources(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public People save(@RequestBody final People people){

        return this.peopleService.save(people);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public People update(@RequestBody final People people){

        return this.peopleService.save(people);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<People> findById(@PathVariable  final Long id){
        return this.peopleService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<People> findAll(){
        return this.peopleService.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody final People people){

        this.peopleService.delete(people);
    }

}
