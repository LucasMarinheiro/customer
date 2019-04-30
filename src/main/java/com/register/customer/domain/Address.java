package com.register.customer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Boolean active;
    private String streetName;
    private Integer number;
    private String description;
    private String complement;

    public Address(){}

    public Long getId() {
        return id;
    }

    public Address setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Address setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public Address setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public Address setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public Address setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Address setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getComplement() {
        return complement;
    }

    public Address setComplement(String complement) {
        this.complement = complement;
        return this;
    }
}
