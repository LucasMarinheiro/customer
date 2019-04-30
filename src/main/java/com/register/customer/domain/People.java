package com.register.customer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class People implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String document;
    private String mail;
    private String phone;
    private String birth;

    public Long getId() {
        return id;
    }

    public People setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public People setName(String name) {
        this.name = name;
        return this;
    }

    public String getDocument() {
        return document;
    }

    public People setDocument(String document) {
        this.document = document;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public People setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public People setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getBirth() {
        return birth;
    }

    public People setBirth(String birth) {
        this.birth = birth;
        return this;
    }
}
