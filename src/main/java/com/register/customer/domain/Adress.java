package com.register.customer.domain;

import javax.persistence.*;

@Entity
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Boolean active;

    public Adress(){}

    public Long getId() {
        return id;
    }

    public Adress setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Adress setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public Adress setActive(Boolean active) {
        this.active = active;
        return this;
    }


}
