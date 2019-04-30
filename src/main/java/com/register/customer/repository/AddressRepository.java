package com.register.customer.repository;

import com.register.customer.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository <Address, Long> {

}

