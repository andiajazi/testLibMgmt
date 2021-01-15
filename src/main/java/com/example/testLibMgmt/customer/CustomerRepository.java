package com.example.testLibMgmt.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> { //Serves as a data access layer to the db

//    @Query("SELECT c FROM Customer c WHERE c.email = ?1") //this is jpql, not sql; Customer is the class
    Optional<Customer> findCustomerByEmail(String email);

}
