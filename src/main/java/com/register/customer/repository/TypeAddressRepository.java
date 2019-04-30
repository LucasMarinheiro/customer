package com.register.customer.repository;

import com.register.customer.domain.TypeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAddressRepository extends JpaRepository <TypeAddress, Long> {

}

