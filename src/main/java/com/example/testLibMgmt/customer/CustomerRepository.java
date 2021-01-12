package com.example.testLibMgmt.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { //Serves as a data access layer
}
