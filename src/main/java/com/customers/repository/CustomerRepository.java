package com.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.customers.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {}
