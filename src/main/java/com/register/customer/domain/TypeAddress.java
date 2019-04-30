package com.register.customer.domain;

import javax.persistence.*;

@Entity
public class TypeAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Boolean active;

    public TypeAddress(){}

    public Long getId() {
        return id;
    }

    public TypeAddress setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TypeAddress setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public TypeAddress setActive(Boolean active) {
        this.active = active;
        return this;
    }


}
